package au.krystinam.ReferenceMaterial.controller;

import au.krystinam.ReferenceMaterial.service.IDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping (value="/demo-api")
public class DemoController {

    @Autowired
    private IDemoService demoService;

    @GetMapping (value="/test")
    public void demoApiTest() {
        demoService.defaultApi();
    }
}
