package com.example.project1.data;

import org.springframework.stereotype.Component;

@Component
public class A {

    private final B b;

    public A(B b) {
        this.b = b;
    }
}
