package demo.ding.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SseController {

	@RequestMapping(value="/push", produces="text/event-stream")
	public @ResponseBody String push(){
		return ""+System.currentTimeMillis();
	}
}
