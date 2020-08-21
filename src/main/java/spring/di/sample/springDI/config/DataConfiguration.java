package spring.di.sample.springDI.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import spring.di.sample.springDI.beans.FakeDataSourceProperties;
import spring.di.sample.springDI.beans.FakeJmsProperties;

@Configuration
//might be breaking Single Responsibility principle
/*
 * can be used when having a single properties file
 * 
 * @PropertySource("classpath:datasource.properties")
 * 
 * 
 */

// for multiple properties file
@PropertySources({ @PropertySource("classpath:datasource.properties"), @PropertySource("classpath:Jms.properties") })
public class DataConfiguration {

	@Value("${db.username}")
	String user;

	@Value("${db.password}")
	String password;

	@Value("${db.url}")
	String url;

	@Value("${jms.username}")
	String userJms;

	@Value("${jms.password}")
	String passwordJms;

	@Value("${jms.url}")
	String urlJms;

	@Bean
	public FakeDataSourceProperties fakeDataProperties() {
		FakeDataSourceProperties fakeDataSourceProperties = new FakeDataSourceProperties();

		fakeDataSourceProperties.setUserName(user);
		fakeDataSourceProperties.setPassword(password);
		fakeDataSourceProperties.setUrl(url);
		return fakeDataSourceProperties;
	}

	@Bean
	public FakeJmsProperties fakeJmsProperties() {
		FakeJmsProperties fakeJmsProperties = new FakeJmsProperties();

		fakeJmsProperties.setUserName(userJms);
		fakeJmsProperties.setPassword(passwordJms);
		fakeJmsProperties.setUrl(urlJms);
		return fakeJmsProperties;

	}

	@Bean
	public static PropertySourcesPlaceholderConfigurer property() {
		PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
		return propertySourcesPlaceholderConfigurer;

	}

}
