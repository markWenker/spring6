package org.springframework.configurationcpp;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author mark.wang
 * @since 2023/3/25
 */
@Configuration
@ComponentScan("org.springframework.configurationcpp")
public class MyComponentScan {

	@ComponentScan("org.springframework.configurationcpp")
	@Configuration
	class InnerClass {
	}
}
