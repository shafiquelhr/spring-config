package org.example.springconfigdemo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AppSecrets {

    @Value("${secret.username}")
    private String username;

    @Value("${secret.password}")
    private String password;

    @Value("${environment}")
    private String environment;

    public void printSecrets() {
        System.out.println("\nUsername: " + username);
        System.out.println("Password: " + password);
        System.out.println("Environment: " + environment);
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEnvironment() {
        return environment;
    }
}