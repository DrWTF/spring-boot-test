package demo.ding.spring.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={TestConfig.class})
@ActiveProfiles("dev")
public class TestBeanIntegrationTest {
	@Autowired
	private TestBean testBean;
	
	@Test
	public void devBeanShouldInject(){
		System.out.println(testBean.getContent());
		Assert.assertEquals("default", testBean.getContent());
	}
}
