package com.banikngproject.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
		 
			WebDriver driver = new ChromeDriver();
			 driver.get("https://demo.guru99.com/v1/index.php");
			
			 
			 
		
	}

}
