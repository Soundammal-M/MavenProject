package org.pompages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sample.BaseClass;

public class Login extends BaseClass {
	public Login() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="username")
	private WebElement txtusername;
	@FindBy(id="password")
	private WebElement password;
	@FindBy(id="login")
	private WebElement login;
	public WebElement getTxtusername() {
		return txtusername;
	}
	public void setTxtusername(WebElement txtusername) {
		this.txtusername = txtusername;
	}
	public WebElement getPassword() {
		return password;
	}
	public void setPassword(WebElement password) {
		this.password = password;
	}
	public WebElement getLogin() {
		return login;
	}
	public void setLogin(WebElement login) {
		this.login = login;
	}
	
	
	
	
	

}
