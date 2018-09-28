package com.sbl.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.sbl.controller")
public class RCTest {

	public static void main(String[] args) {
		
SpringApplication.run(RCTest.class, args);
	}

}
