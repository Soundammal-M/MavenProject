package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Data extends BaseClass{
	public static void main(String[] args) {
		WebDriver d = launchBrowser();
		launchUrl("https://www.facebook.com/");
		maxBrowser();
		pageTitle();
		pageUrl();
		WebElement user = d.findElement(By.id("email"));
		fill(user,"Sellenium");
		clickDouble(user);
		rightClick(user);
	
		
		
	}

}
