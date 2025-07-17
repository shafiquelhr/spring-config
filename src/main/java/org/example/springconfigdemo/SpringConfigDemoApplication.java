package org.example.springconfigdemo;

import org.example.springconfigdemo.config.AppSecrets;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringConfigDemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringConfigDemoApplication.class, args);

        // Get the AppSecrets bean
        AppSecrets secrets = context.getBean(AppSecrets.class);
        secrets.printSecrets();
    }

}
