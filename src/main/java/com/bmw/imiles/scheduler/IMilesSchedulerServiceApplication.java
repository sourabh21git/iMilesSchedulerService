package com.bmw.imiles.scheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class IMilesSchedulerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(IMilesSchedulerServiceApplication.class, args);
	}

}
