package demo.ding.spring.mvc.socket;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class TopicSocketController {

	@MessageMapping("/say")
	@SendTo("/topic/getResponse")
	public String say(String message) throws InterruptedException{
		Thread.sleep(6000);
		return message;
	}
	
}
