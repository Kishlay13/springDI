package spring.di.sample.springDI.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import spring.di.sample.springDI.service.GreetingService;

@Controller
public class ConstructorInjectedController {

	// ideally use case declare type private final and DI using constructor
	// with this mode @Autowired annotation is not needed
	private final GreetingService greetingService;

	public ConstructorInjectedController(@Qualifier("constructorGreetingServiceImpl") GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}

	public String getGreetingService() {
		return greetingService.getGreetings();
	}

}
