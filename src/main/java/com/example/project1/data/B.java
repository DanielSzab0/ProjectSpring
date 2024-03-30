package com.example.project1.data;

import org.springframework.stereotype.Component;

@Component
public class B {

    private final C c;

    public B(C c) {
        this.c = c;
    }
}
