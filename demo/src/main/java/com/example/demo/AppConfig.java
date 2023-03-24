package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class AppConfig {

    private final ApplicationContext context;


    @Autowired
    public AppConfig(ApplicationContext context) {
        this.context = context;
        executeMethods();
    }

    public void executeMethods(){
        FirstComponent firstComponent = (FirstComponent)context.getBean("firstComponent",FirstComponent.class);
        SecondComponent secondComponent = context.getBean("secondComponent",SecondComponent.class);

        firstComponent.firstMethod();
        secondComponent.secondMethod();
    }

}
