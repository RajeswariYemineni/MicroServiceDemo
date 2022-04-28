package com.sapient.room.search;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class RoomSearchApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoomSearchApplication.class, args);
	}

}
