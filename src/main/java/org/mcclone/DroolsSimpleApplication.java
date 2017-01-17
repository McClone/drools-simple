package org.mcclone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:spring-drools.xml")
public class DroolsSimpleApplication {

	public static void main(String[] args) {
		SpringApplication.run(DroolsSimpleApplication.class, args);
	}
}
