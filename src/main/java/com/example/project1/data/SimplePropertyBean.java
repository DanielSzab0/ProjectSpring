package com.example.project1.data;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SimplePropertyBean {

    @Value("${my_value}")
    private String injectedValue;

    public String getInjectedValue() {
        return injectedValue;
    }
}
