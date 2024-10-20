package springmvc2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/welcome")
	public ModelAndView hello () {
		ModelAndView m=new ModelAndView();
		m.setViewName("welcome");
		return m;
	}
	
	@RequestMapping("/message")
	public ModelAndView message () {
		ModelAndView m=new ModelAndView();
		m.setViewName("message");
		return m;
	}
	
	@RequestMapping("/bye")
	public ModelAndView bye () {
		ModelAndView m=new ModelAndView();
		m.setViewName("bye");
		return m;
	}
	
}
