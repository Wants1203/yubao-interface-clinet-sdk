package com.api.yubaointerfaceclinetsdk;

import lombok.Data;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@Data
@ConfigurationProperties("yubao.client")
@ComponentScan
public class YuBaoClientConfig {

    private String accessKey;

    private String secretKey;
    @Bean
    public static void main(String[] args) {
        SpringApplication.run(YuBaoClientConfig.class, args);
    }

}
