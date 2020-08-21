package spring.di.sample.springDI.beans;

/*
 * 
 * @author Kishlay Singh
 * */
//@Configuration
public class FakeDataSourceProperties {

	// @Value("${db.username}")
	private String userName;
	// @Value("${db.password}")
	private String password;
	// @Value("${db.url}")
	private String url;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
