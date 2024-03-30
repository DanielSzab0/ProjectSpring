package com.example.project1.data;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Banane implements Fructe{
    @Override
    public String cumpar() {
        return "Cumpar banane";
    }
}
