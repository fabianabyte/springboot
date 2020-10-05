package com.digitalinnovationone.fabianabyte.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @Value("${app.message}")
    private String appMessage;

    @Value("${ENV_DB:NENHUMA}")
    private String dbVariavelDeAmbiente;

    @GetMapping("/appMessage")
    public String getAppMessage(){
        return appMessage;
    }

    @GetMapping("/variavelAmbienteDB")
    public String getDbVariavelDeAmbiente(){
        return dbVariavelDeAmbiente;
    }
}
