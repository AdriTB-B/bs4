package com.adri.bs4;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@ConfigurationProperties
@RestController
public class Controlador {
    @Value("${VAR1}") String var1;
    @Value("${My.VAR2}")  int var2;
    @Value("${VAR3:var3 no tiene valor}") String var3;

    @GetMapping("/valores/")
    public String getValue(){
        return "valor de var1 es: "+var1+ ", valor de my.var2 es: "+var2;
    }

    @GetMapping("/var3/")
    public String getVar3(){
        return  "valor de var3 es: "+var3;
    }

}
