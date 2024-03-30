package com.example.project1;

import com.example.project1.data.Car;
import com.example.project1.data.MultiplePropertyBean;
import com.example.project1.data.SimplePropertyBean;
import com.example.project2.SomeBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MainLogger implements CommandLineRunner {

    @Autowired
    private SimplePropertyBean simplePropertyBean;

    @Autowired
    private MultiplePropertyBean multiplePropertyBean;

    @Qualifier("getFord")
    @Autowired
    private Car car;

    @Autowired
    private SomeBean someBean;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(car.engine());
        System.out.println(simplePropertyBean.getInjectedValue());

        System.out.println(multiplePropertyBean.getPropA());
        System.out.println(multiplePropertyBean.getPropB());
        System.out.println(multiplePropertyBean.getPropC());
        System.out.println(multiplePropertyBean.getPropD());
    }
}
