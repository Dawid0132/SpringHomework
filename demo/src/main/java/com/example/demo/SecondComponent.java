package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;



@Component
public class SecondComponent {


    public SecondComponent(FirstComponent firstComponent) {
    }


    public void secondMethod() {
        System.out.println("Hello from method in SecondComponent!");
    }


}
