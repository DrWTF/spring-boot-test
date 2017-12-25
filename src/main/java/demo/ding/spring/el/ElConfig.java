package demo.ding.spring.el;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

@Configuration
@PropertySource("classpath:xxx.xxx")
@PropertySource("classpath*:xxx.xxx")
@PropertySource("/xx/xx")
public class ElConfig {
	@Value("I Love You!")
	private String noarmal;
	
	@Value("#{systemProperties['os.name']}")
	private String osName;
	
	@Value("{T(java.lang.Math).random()*100.0}")
	private String randomNumber;
	
	@Value("#{demoService.another}")
	private String fromAnother;
	
	@Value("classpath:com/xx/xx/xx.xx")
	private Resource testFile;
	
	@Value("http://www.baidu.com")
	private Resource testUrl;
	
	@Value("${book.name}")
	private String bookName;
	
	@Autowired
	private Environment environment;
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer propertyConfigure(){
		return new PropertySourcesPlaceholderConfigurer();
	}
}
