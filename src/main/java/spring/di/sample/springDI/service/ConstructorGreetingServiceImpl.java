package spring.di.sample.springDI.service;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingServiceImpl implements GreetingService {

	public String getGreetings() {
		// TODO Auto-generated method stub
		return "Hello-constructor";
	}

}
