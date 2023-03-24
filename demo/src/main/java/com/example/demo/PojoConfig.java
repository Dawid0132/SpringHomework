package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class PojoConfig {

    @Value("${my.custom.properties}")
    private String customValue;

    @Value("${myapp.mybean.enabled}")
    private String key;


    @Value("${ : unknown parameter}")
    private String someDefault;


    @Bean
    @ConditionalOnProperty(name = "myapp.mybean.enabled", havingValue = "true")
    public Pojo pojo() {
        System.out.println(customValue);
        System.out.println(someDefault);
        return new Pojo();
    }

    @Bean
    @ConditionalOnProperty(name = "myapp.mybean.enabled", havingValue = "true")
    public List<String> defaultData() {
        System.out.println(customValue);
        System.out.println(someDefault);
        return List.of("first", "second", "third", "fourth", "fifth");
    }
}
