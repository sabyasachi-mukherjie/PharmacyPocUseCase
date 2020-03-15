package org.pharmacy.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class PaymentServiceClient {

	public static void main(String[] args) {
		SpringApplication.run(PaymentServiceClient.class, args);
	}

}
