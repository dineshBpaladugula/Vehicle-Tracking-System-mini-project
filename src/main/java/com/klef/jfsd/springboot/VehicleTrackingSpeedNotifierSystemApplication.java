package com.klef.jfsd.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.klef.jfsd.springboot")
public class VehicleTrackingSpeedNotifierSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(VehicleTrackingSpeedNotifierSystemApplication.class, args);
		System.out.println("Vehicle tracking system");
	}

}
