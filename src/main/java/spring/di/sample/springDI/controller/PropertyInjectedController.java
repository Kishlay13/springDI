package spring.di.sample.springDI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import spring.di.sample.springDI.service.GreetingService;

@Controller
public class PropertyInjectedController {

	@Autowired
	@Qualifier("propertyGreetingServiceImpl")
	public GreetingService greetingService;

	public String greeting() {
		return greetingService.getGreetings();
	}

}
