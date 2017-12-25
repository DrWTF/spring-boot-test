package demo.ding.spring.mvc.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;

import demo.ding.spring.mvc.MvcConfig;
import demo.ding.spring.mvc.async.PushService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {MvcConfig.class})
@WebAppConfiguration("src/main/resources")
public class TestControllerIntegrationTest {
	private MockMvc mockMvc;
	@Autowired
	private PushService pushService;
	@Autowired
	private WebApplicationContext context;
	@Autowired
	MockHttpSession session;
	@Autowired
	MockHttpServletRequest request;
	
	@Before
	public void setup(){
		mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
	}
	
	@Test
	public void test() throws Exception{
		mockMvc.perform(get("/defer"))
			.andExpect(status().isOk())
			.andExpect(view().name(""))
			.andExpect(model().attribute("xxx", ""))
			.andExpect(content().string(pushService.getResult().toString()));
	}

}
