package demo.ding.spring.aop;

import org.springframework.stereotype.Service;

@Service
public class AnnotationService {

	@Action(name="注解拦截的add操作")
	public void add(){}

	@Action(name="注解拦截的add操作")
	public void add(String name){}
}
