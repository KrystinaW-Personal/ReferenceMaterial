
@Component
public class AWS_ApiParams {

    @Value("${spring.profiles.active}")
    private String activeProfile;

    @Value("${aws_api.local.params}")
    private String params;

    private String apiHost;
    private String apiAuth;

    public void syncKey() {

    }

}