package com.projects.coronavirustracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CoronavirusTrackerApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(CoronavirusTrackerApplication.class, args);
	}

}
