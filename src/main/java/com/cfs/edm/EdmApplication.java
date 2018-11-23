package com.cfs.edm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class EdmApplication {

	public static void main(String[] args) {
		SpringApplication.run(EdmApplication.class, args);
	}
}
