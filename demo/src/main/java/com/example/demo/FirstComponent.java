package com.example.demo;


import org.springframework.stereotype.Component;

@Component
public class FirstComponent {

    public FirstComponent() {
    }

    public void firstMethod(){
        System.out.println("Hello from method in FirstComponent!");
    }
}
