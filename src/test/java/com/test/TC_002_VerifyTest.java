package com.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pageobject.LoginPom;
import com.utility.BaseClass;

public class TC_002_VerifyTest extends BaseClass {
	
	
	@Test
	public void VerifyLogin() {
		
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		login.getEmail().sendKeys("9552734675");
		login.getPass().sendKeys("Hiwale@123");
		login.getButton().click();
		
		driver.close();
	}

}
