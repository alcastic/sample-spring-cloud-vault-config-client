package cl.acc.cloud.samplespringvaultconfigclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @Value("${message}")
    String host = "Hello World";

    @RequestMapping("/")
    public String home() {
        return host;
    }

}
