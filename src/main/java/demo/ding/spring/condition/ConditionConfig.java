package demo.ding.spring.condition;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConditionConfig {
	@Bean
	@Conditional(WindowsCondition.class)
	public String windows(){
		return "windowsServiceBean";
	}

	@Bean
	@Conditional(WindowsCondition.class)
	public String linux(){
		return "linuxServiceBean";
	}

}
