package org.sample;
import org.pompages.Registration;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Adactin extends BaseClass {
	
	
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
		    String captcha = sc.next();
			WebDriver d = launchBrowser();
			launchUrl("http://www.adactin.com/HotelApp/");
			maxBrowser();
			pageTitle();
			pageUrl();
			Registration r = new Registration();
		    WebElement element =r.getRegister();
		    btnClick(element);
		    WebElement user1 = r.getUser();
		    fill(user1,"Sandhiya");
		    WebElement psw =r.getPassword();
		    fill(psw,"Sandy@2204");
		    WebElement rpsw= r.getRe_password();
		    fill(rpsw,"Sandy@2204");
		    WebElement fname =r.getFullName();
		    fill(fname,"Soundammalmoorthi");
		    WebElement email =r.getEmail();
		    fill(email,"sound94gce@gmail.com");
		    WebElement catcha= r.getCapt();
		    fill(catcha,captcha);
		    WebElement term =r.getTerm();
		    btnClick(term);
		    	
			
		}
}
