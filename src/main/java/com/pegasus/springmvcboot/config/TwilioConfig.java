package com.pegasus.springmvcboot.config;

import com.twilio.Twilio;
import jakarta.annotation.PostConstruct;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@Data
@ConfigurationProperties(prefix = "twilio")
@Slf4j
public class TwilioConfig {

    @Value("${twilio.account-sid}")
    private String accountSid;

    @Value("${twilio.auth-token}")
    private String authToken;

    @Value("${twilio.phone-number}")
    private String phoneNumber;

    @PostConstruct
    public void setup() {
        if (accountSid == null || authToken == null || phoneNumber == null) {
            log.info("Twilio configuration properties are missing!");
        }
        Twilio.init(accountSid, authToken);
        log.info("Twilio initialized successfully with account SID: {}", accountSid);
    }

}
