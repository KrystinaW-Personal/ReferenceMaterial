package au.krystinam.ReferenceMaterial.model;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;
import software.amazon.awssdk.auth.credentials.DefaultCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.ssm.SsmClient;
import software.amazon.awssdk.services.ssm.model.GetParameterRequest;
import software.amazon.awssdk.services.ssm.model.GetParameterResponse;
import software.amazon.awssdk.services.ssm.model.SsmException;

import java.util.HashMap;
import java.util.Map;

@Component
public class AWS_ApiParams {

    private static final Logger logger = LoggerFactory.getLogger(AWS_ApiParams.class);
    @Value("${spring.profiles.active}")
    private String activeProfile;

    @Value("${aws_api.local.params}")
    private String params;

    private API_Key api_key;

    public void awsSyncKey() {
        Map<String,String> hostApiParams;
        String hostApiToken = "";
        if ("local".equalsIgnoreCase(activeProfile)) {
            hostApiToken = params;
        } else {
            hostApiToken = getParameter("paramKeyName");
        }
        hostApiParams = new Gson().fromJson(
                hostApiToken, new TypeToken<HashMap<String,String>>() {
                }.getType()
        );

        api_key.setApiHost(hostApiParams.get("host"));
        api_key.setApiValue(hostApiParams.get("value"));
        logger.info("Host: " + api_key.getApiHost());
    }

    private String getParameter(final String key) {
        final Region region = Region.AP_SOUTHEAST_2; // Australia East
        String paramValue = "";
        SsmClient ssmClient = SsmClient.builder()
                .region(region)
                .credentialsProvider(DefaultCredentialsProvider.create())
                .build();
        try {
            GetParameterRequest request = GetParameterRequest.builder()
                    .name(key)
                    .withDecryption(true)
                    .build();
            GetParameterResponse response = ssmClient.getParameter(request);
            paramValue = (response.parameter().value());
        } catch (SsmException se) {
            logger.error("Error recovering API Token" + key + ": " + se.getMessage());
            System.exit(1);
        }
        ssmClient.close();
        return paramValue;
    }
}