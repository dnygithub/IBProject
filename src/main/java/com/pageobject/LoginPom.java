package com.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPom {
	
	WebDriver driver;
	
	public LoginPom(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(how=How.XPATH,using="//input[@type='text']")
	private WebElement email;

	@FindBy(how=How.XPATH,using="//input[@type='password']")
	private WebElement pass;
	
	@FindBy(how=How.XPATH,using="//button[@name='login']")
	private WebElement button;


public WebElement getEmail() {
	return email;
}


public WebElement getPass() {
	return pass;
}


public WebElement getButton() {
	return button;
}

}
