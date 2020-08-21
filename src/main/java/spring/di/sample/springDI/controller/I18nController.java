package spring.di.sample.springDI.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import spring.di.sample.springDI.service.GreetingService;

@Controller
public class I18nController {
	private final GreetingService greetingService;

	public I18nController(@Qualifier("i18nService") GreetingService greetingService) {
		super();
		this.greetingService = greetingService;

	}

	public String getGreeting() {
		return greetingService.getGreetings();
	}

}
