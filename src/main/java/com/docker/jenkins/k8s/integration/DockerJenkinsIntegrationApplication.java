package com.docker.jenkins.k8s.integration;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerJenkinsIntegrationApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DockerJenkinsIntegrationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Docker Jenkins Integrations...");
	}
}