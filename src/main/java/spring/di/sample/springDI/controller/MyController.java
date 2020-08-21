package spring.di.sample.springDI.controller;

import org.springframework.stereotype.Controller;

import spring.di.sample.springDI.service.PrimaryGreetingServiceImpl;

@Controller
public class MyController {

	private final PrimaryGreetingServiceImpl primaryGreetingServiceImpl;

	public String ex() {

		return primaryGreetingServiceImpl.getGreetings();
	}

	public MyController(PrimaryGreetingServiceImpl primaryGreetingServiceImpl) {
		super();
		this.primaryGreetingServiceImpl = primaryGreetingServiceImpl;
	}

}
