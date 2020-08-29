package com.online.appointment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AppointmentRegistryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppointmentRegistryServiceApplication.class, args);
	}

}
