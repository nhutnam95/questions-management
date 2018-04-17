package com.huongdanjava.questionservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CompositeQuestionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompositeQuestionServiceApplication.class, args);
	}
}
