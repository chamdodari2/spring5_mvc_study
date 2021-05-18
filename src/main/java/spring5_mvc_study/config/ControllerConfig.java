package spring5_mvc_study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "spring5_mvc_study.controller" })
public class ControllerConfig {
	@Bean
	public HelloController helloController() {
		return new HelloController();
	}
}
