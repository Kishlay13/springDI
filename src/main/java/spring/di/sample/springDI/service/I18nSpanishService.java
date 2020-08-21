package spring.di.sample.springDI.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"SP","default"})
@Service("i18nService")
public class I18nSpanishService implements GreetingService{

	public String getGreetings() {
		// TODO Auto-generated method stub
		return "Hola-sp";
	}

}
