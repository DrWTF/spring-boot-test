package demo.ding.spring.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class TestConfig {
	@Bean
	@Profile("dev")
	public TestBean devTestBean(){
		return new TestBean();
	}

	@Bean
	@Profile("pro")
	public TestBean proTestBean(){
		return null;
	}
}
