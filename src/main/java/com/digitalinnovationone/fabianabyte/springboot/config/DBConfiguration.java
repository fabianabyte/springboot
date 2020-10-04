package com.digitalinnovationone.fabianabyte.springboot.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ConfigurationProperties("spring.datasource")
@Getter
@Setter
public class DBConfiguration {
    private String driverClassName;
    private String url;
    private String username;
    private String password;

    @Profile("dev")
    @Bean
    public String getDevDataBaseConnection(){
        System.out.println("H2 no desenvolvimento.");
        System.out.println(url);
        System.out.println(username);

        return "Banco de dados H2 para desenvolvimento";
    }

    @Profile("prod")
    @Bean
    public String getProdDataBaseConnection(){
        System.out.println("Banco para produção");
        System.out.println(driverClassName);
        System.out.println(url);
        System.out.println(username);

        return "Banco de dados para produção";
    }

}
