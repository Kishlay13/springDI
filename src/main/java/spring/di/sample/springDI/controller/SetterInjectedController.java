package spring.di.sample.springDI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import spring.di.sample.springDI.service.GreetingService;

@Controller
public class SetterInjectedController {
	public String getGreetingService() {
		return greetingService.getGreetings();
	}

	//DI using setter
	@Autowired
	// for multiple implementations of GreetingService we segregate them based on qualifier name
	@Qualifier("setterGreetingServiceImpl")
	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	private GreetingService greetingService;

}
