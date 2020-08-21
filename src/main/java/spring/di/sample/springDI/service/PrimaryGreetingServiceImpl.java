package spring.di.sample.springDI.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PrimaryGreetingServiceImpl implements GreetingService {

	public String getGreetings() {
		// TODO Auto-generated method stub
		return "Hello-primary";
	}

}
