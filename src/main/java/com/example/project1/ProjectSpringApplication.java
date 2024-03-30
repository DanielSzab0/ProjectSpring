package com.example.project1;

import com.example.project1.data.Fructe;
import com.example.project1.data.Product;
import com.example.project1.data.Product2;
import com.example.project1.data.Product3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectSpringApplication implements CommandLineRunner {

	@Autowired
	private Product product; // field injection


	private Product2 product2; // constructor injection

	public ProjectSpringApplication(Product2 product2) {
		this.product2 = product2;
	}


	private Product3 product3; //setter injection

	@Autowired
	public void setProduct3(Product3 product3) {
		this.product3 = product3;
	}

//	@Qualifier("mere")
	@Autowired
	private Fructe fructe;


	public static void main(String[] args) {
		SpringApplication.run(ProjectSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		System.out.println(product.getMessage());
//		System.out.println(fructe.cumpar());
	}
}
