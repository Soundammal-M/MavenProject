package org.pompages;

import java.util.Scanner;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sample.BaseClass;

public class Registration extends BaseClass {
	
	public Registration()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//td[@class='login_register']")
    private WebElement register;
	@FindBy(xpath="//input[@id='username']")
	private WebElement user;
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	@FindBy(xpath="//input[@id='re_password']")
	private WebElement re_password;
	@FindBy(xpath="//input[@id='full_name']")
	private WebElement fullName;
	@FindBy(xpath="email_add")
	private WebElement email;
	@FindBy(xpath="//input[@id='tnc_box']")
	private WebElement term;
	
	
	Scanner sc = new Scanner(System.in);
	String captcha = sc.next();
			;
	@FindBy(xpath="//input[@id='captcha-form']")
	private WebElement capt;
	
	
	public WebElement getRegister() {
		return register;
	}
	public void setRegister(WebElement register) {
		this.register = register;
	}
	public WebElement getUser() {
		return user;
	}
	public void setUser(WebElement user) {
		this.user = user;
	}
	public WebElement getPassword() {
		return password;
	}
	public void setPassword(WebElement password) {
		this.password = password;
	}
	public WebElement getRe_password() {
		return re_password;
	}
	public void setRe_password(WebElement re_password) {
		this.re_password = re_password;
	}
	public WebElement getFullName() {
		return fullName;
	}
	public void setFullName(WebElement fullName) {
		this.fullName = fullName;
	}
	public WebElement getEmail() {
		return email;
	}
	public void setEmail(WebElement email) {
		this.email = email;
	}
	public Scanner getSc() {
		return sc;
	}
	public void setSc(Scanner sc) {
		this.sc = sc;
	}
	
	
	public WebElement getCapt() {
		return capt;
	}
	public void setCapt(WebElement capt) {
		this.capt = capt;
		
	}
	public WebElement getTerm() {
		return term;
	}
	public void setTerm(WebElement term) {
		this.term = term;
	}	
}

