package demo.ding.spring.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/anno")
public class AnnoController {
	
	@RequestMapping(produces="text/plain;charset=UTF-8")
	public @ResponseBody String index(HttpServletRequest request){
		return request.getRequestURI();
	}
	
	@RequestMapping(value="/pathvar/{str}", produces="text/plain;charset=UTF-8")
	public @ResponseBody String pathVar(@PathVariable String str, HttpServletRequest request){
		return request.getRequestURI();
	}
	
	@RequestMapping(value="/requestParam", produces="text/plain;charset=UTF-8")
	public @ResponseBody String requestParam(Long id, HttpServletRequest request){
		return request.getRequestURI();
	}
	
	@RequestMapping(value="/obj", produces="application/json;charset=UTF-8")
	@ResponseBody
	public String pathVar(MvcConfig obj, HttpServletRequest request){
		return request.getRequestURI();
	}
	
	@RequestMapping(value={"/a", "/b"}, produces="text/plain;charset=UTF-8")
	public @ResponseBody String defferentPath(HttpServletRequest request){
		return request.getRequestURI();
	}
}
