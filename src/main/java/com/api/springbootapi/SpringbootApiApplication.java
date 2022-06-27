package com.api.springbootapi;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.api.springbootapi.utils.AuditorAwareImpl;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditorAware")
public class SpringbootApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApiApplication.class, args);
	}

	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}

	@Bean
	public AuditorAware<String> auditorAware(){
		return new AuditorAwareImpl();
	}

}
