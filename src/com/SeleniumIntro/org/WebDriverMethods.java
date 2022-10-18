package com.SeleniumIntro.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Testing\\Drive\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
        
		driver.manage().window().maximize();
		
		
		driver.navigate().to("https://twitter.com/i/flow/login");
		
		driver.navigate().to("https://www.facebook.com/login");
	
		driver.navigate().back();
		
		driver.navigate().refresh();
		
		driver.navigate().forward();
		
		driver.get("https://amazon.in/");
		
		String title = driver.getTitle();
		
		System.out.println(title);
	
		driver.quit();
	}

}
