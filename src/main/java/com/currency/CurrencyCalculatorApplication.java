package com.currency;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * The Main Class for the App.
 */
@SpringBootApplication
public class CurrencyCalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyCalculatorApplication.class, args);
	}

}
