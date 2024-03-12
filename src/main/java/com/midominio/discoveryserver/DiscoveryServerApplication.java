package com.midominio.discoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Principal class in spring boot eureka server.
 *
 * @author David G.
 * @version 1.0
 */
@SpringBootApplication
@EnableEurekaServer
public class DiscoveryServerApplication {

	/**
	 * Initializer method main.
	 *
	 * @param args parameters.
	 */
	public static void main(String[] args) {
		SpringApplication.run(DiscoveryServerApplication.class, args);
	}

}
