package demo.ding.spring.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("demo.ding.spring.aop")
@EnableAspectJAutoProxy
public class AopConfig {

}
