package com.gl.CompleteUT.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.PropertiesPropertySource;

import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

@Configuration
public class GitHubPropertiesLoader {

    @Value("${github.properties.url}")
    private String githubPropertiesUrl;

    @Bean
    public Properties githubProperties() throws Exception {
        Properties properties = new Properties();
        URL url = new URL(githubPropertiesUrl);
        try (InputStream input = url.openStream()) {
            properties.load(input);
        }
        return properties;
    }
}
