package demo.ding.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AopMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
		AnnotationService annotationService = context.getBean(AnnotationService.class);
		MethodService methodService = context.getBean(MethodService.class);
		annotationService.add("siro");
		methodService.add();
		context.close();
	}

}
