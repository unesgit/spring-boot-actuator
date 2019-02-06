package com.example.configuration.client.contributor;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.actuate.info.Info.Builder;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

@Component
public class BuildInfoContributor implements InfoContributor {
    
    @Value("${app.build.version}")
    String buildVersion;
    
    @Value("${app.java.version}")
    String javaVersion;
    
    @Override
    public void contribute(Builder builder) {
        Map<String, String> data = new HashMap<String, String>();
        data.put("build.version", buildVersion);
        data.put("java.version", javaVersion);
        builder.withDetail("buildInfo", data);
        
    }
    
}