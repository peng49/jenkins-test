package io.github.peng49;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsTestApplication {

    @RequestMapping("/hello")
    public String index(){
        return "Hello Jenkins! v1.0.2";
    }

    public static void main(String[] args) {
        SpringApplication.run(JenkinsTestApplication.class, args);
    }
}
