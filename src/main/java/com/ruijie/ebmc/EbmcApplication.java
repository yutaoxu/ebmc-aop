package com.ruijie.ebmc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("order-consumer.xml")
public class EbmcApplication {

	public static void main(String[] args) {
		SpringApplication.run(EbmcApplication.class, args);
	}
}
