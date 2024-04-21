package com.springservice.demo;

import com.springservice.demo.wsdl.CelsiusToFahrenheitResponse;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

//	@Bean
//	CommandLineRunner lookup(ClientClass clientClass) {
//		return args -> {
//			String value = "40";
//
//			if (args.length > 0) {
//				value = args[0];
//			}
//			CelsiusToFahrenheitResponse response = clientClass.getResponse(value);
//			System.err.println(response.getCelsiusToFahrenheitResult());
//		};
//	}

}
