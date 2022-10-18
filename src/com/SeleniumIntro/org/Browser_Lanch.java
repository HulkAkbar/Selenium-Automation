package com.SeleniumIntro.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Lanch {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\DriverThambi\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
        driver.get("https://www.instagram.com/?hl=en");		
		
	}

}
