package com.example.demo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@ToString
@ConfigurationProperties(prefix = "oauth")
public class PropertiesConfiguration {
    @NotBlank
    private String clientId;
    @NotBlank
    private String clientSecret;
    @URL
    private String redirectUri;
    @NotBlank
    private String grantType;
}
