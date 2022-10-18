package com.SeleniumIntro.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absoulute {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver"
				,"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Testing\\NewDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://wwww.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement pass = driver.findElement(By.xpath(""));
		pass.sendKeys("Akbar007");
	}
}
