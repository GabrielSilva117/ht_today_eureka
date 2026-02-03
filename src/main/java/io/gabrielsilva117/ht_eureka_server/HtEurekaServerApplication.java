package io.gabrielsilva117.ht_eureka_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class HtEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HtEurekaServerApplication.class, args);
	}

}
