package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pageobject.LoginPom;
import com.utility.BaseClass;
import com.utility.Library;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_001_VerifyLoginPage extends BaseClass {
	
	
	@Test
	public void VerifyLoginPage() {
		
		
		LoginPom call=PageFactory.initElements(driver, LoginPom.class);
		Library.custom_sendkeys(call.getEmail(), "sfghsa");
		Library.custom_sendkeys(call.getPass(), "hsdg");
		Library.custom_click(call.getButton());
//		call.getEmail().sendKeys("9552734675");
//        call.getPass().sendKeys("Hiwale@123");
//        call.getButton().click();
        
        driver.close();
		
	}

}








