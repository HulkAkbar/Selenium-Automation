package com.SeleniumIntro.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver"
				,"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Testing\\NewDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		WebElement tv = driver.findElement(By.xpath(""));
		tv.click();
	}

}
