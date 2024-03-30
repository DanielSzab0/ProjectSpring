package com.example.project1.data;

import org.springframework.stereotype.Component;

@Component
public class Mere implements Fructe{
    @Override
    public String cumpar() {
        return "Cumpar mere";
    }
}
