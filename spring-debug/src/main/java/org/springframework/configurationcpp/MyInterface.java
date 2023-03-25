package org.springframework.configurationcpp;

import org.springframework.context.annotation.Bean;

/**
 * @author mark.wang
 * @since 2023/3/25
 */
public interface MyInterface {

	@Bean
	default String test() {
		return "MyInterface";
	}
}
