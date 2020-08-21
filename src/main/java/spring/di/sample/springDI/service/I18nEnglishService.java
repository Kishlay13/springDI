package spring.di.sample.springDI.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18nService")
public class I18nEnglishService implements GreetingService{

	public String getGreetings() {
		// TODO Auto-generated method stub
		return "Hello-en";
	}

}
