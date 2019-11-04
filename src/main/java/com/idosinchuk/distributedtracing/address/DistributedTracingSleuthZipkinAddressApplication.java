package com.idosinchuk.distributedtracing.address;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
public class DistributedTracingSleuthZipkinAddressApplication {

	public static void main(String[] args) {
		SpringApplication.run(DistributedTracingSleuthZipkinAddressApplication.class, args);
	}

	// Bean for ModelMapper
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
}
