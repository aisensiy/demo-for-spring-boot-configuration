package com.example.demo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class ValueConfiguration {
    private String clientId;
    private String clientSecret;

    @Autowired
    public ValueConfiguration(
        @Value("${sso.clientId}") String clientId,
        @Value("${sso.clientSecret}") String clientSecret) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
    }
}
