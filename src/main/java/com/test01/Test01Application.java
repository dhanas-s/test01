package com.test01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Test01Application {



	public static void main(String[] args) {

        int x= 1000;
        System.out.print(x);
		int y =100;
		SpringApplication.run(Test01Application.class, args);
	}

}
