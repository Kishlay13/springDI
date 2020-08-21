package spring.di.sample.springDI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import spring.di.sample.springDI.beans.FakeDataSourceProperties;
import spring.di.sample.springDI.beans.FakeJmsProperties;
import spring.di.sample.springDI.controller.ConstructorInjectedController;
import spring.di.sample.springDI.controller.I18nController;
import spring.di.sample.springDI.controller.MyController;
import spring.di.sample.springDI.controller.PropertyInjectedController;
import spring.di.sample.springDI.controller.SetterInjectedController;

@SpringBootApplication
public class SpringDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringDiApplication.class, args);
		System.out.println("Main Controller");
		
		//code for multiple properties
		FakeDataSourceProperties p = (FakeDataSourceProperties) ctx.getBean(FakeDataSourceProperties.class);
		System.out.println(p.getUserName());

		FakeJmsProperties f = (FakeJmsProperties) ctx.getBean(FakeJmsProperties.class);
		System.out.println(f.getUserName());
		
		//code for multiple properties
		
		
		
		
		  MyController my = (MyController) ctx.getBean("myController");
		  System.out.println(my.ex());
		  
		  System.out.println("Profile Management"); I18nController i18nController =
		  (I18nController) ctx.getBean("i18nController");
		  System.out.println(i18nController.getGreeting());
		  
		  System.out.println("Constructor"); ConstructorInjectedController
		  constructorInjectedController = (ConstructorInjectedController) ctx
		  .getBean("constructorInjectedController");
		  System.out.println(constructorInjectedController.getGreetingService());
		  
		  System.out.println("Setter"); SetterInjectedController
		  setterInjectedController = (SetterInjectedController) ctx
		  .getBean("setterInjectedController");
		  System.out.println(setterInjectedController.getGreetingService());
		  
		  System.out.println("Property"); PropertyInjectedController
		  propertyInjectedController = (PropertyInjectedController) ctx
		  .getBean("propertyInjectedController");
		  System.out.println(propertyInjectedController.greeting());
		 
	}

}
