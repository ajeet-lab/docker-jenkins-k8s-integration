package com.docker.jenkins.k8s.integration;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerJenkinsIntegrationApplication {

	public static void main(String[] args) {
		System.out.println("Starting point here apppppp");
		SpringApplication.run(DockerJenkinsIntegrationApplication.class, args);
	}
}
