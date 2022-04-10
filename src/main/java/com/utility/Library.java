package com.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Library {
	
	
	public static void custom_sendkeys(WebElement element, String value) {
		try { 
			element.sendKeys(value);
			System.out.println("successfully send value");
		}
		catch(Exception e) {
			System.out.println("unable to send value"+e);
		}
		}


	public static void custom_click(WebElement element) {
	try {
		element.click();
		System.out.println("click successfully");
		}
	catch(Exception e) {
		System.out.println("unable to click");
		}
		}
	
	public static void  custome_getScroll(WebDriver driver) {
	 
	}
		}

