package com.skull.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Main class for config server
 * 
 * @author Carlos Feitosa (carlos.feitosa.nt@gmail.com)
 * @since 2020-08-23
 *
 */
@SpringBootApplication
@EnableConfigServer
public class MpmSrvConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(MpmSrvConfigApplication.class, args);
	}

}
