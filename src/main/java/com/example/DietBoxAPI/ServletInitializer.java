package com.example.paasta.DietBoxAPI;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(DietBoxApiApplication.class).profiles("spring.config.name: paasta/DietBoxAPI");
	}

}
