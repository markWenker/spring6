package org.springframework.configurationcpp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:xml/configurationcpp/config.properties")
public class MyService {
	@Value("${jdbc.username}")
	private String name;

	@Bean
	public String show() {
		System.out.println(name);
		return name;
	}
}
