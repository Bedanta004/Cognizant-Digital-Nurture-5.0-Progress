package com.Bedanta.demoApp2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApp2Application {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(DemoApp2Application.class, args);

//		Dev obj = new Dev();
//		Object Creation Process

		Dev obj = context.getBean(Dev.class);
		obj.build();

	}

}
