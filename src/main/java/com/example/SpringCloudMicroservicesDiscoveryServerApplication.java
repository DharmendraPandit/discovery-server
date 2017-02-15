package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableConfigurationProperties
@EnableEurekaServer
public class SpringCloudMicroservicesDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudMicroservicesDiscoveryServerApplication.class, args);
	}
}
