package com.SeleniumIntro.org;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Scroll_Up_Down {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Testing\\NewDriver\\chromedriver.exe");
		
        WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.amazom.in/");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,5000);");//scroll down
		
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,-5000);");//scroll up
		
		js.executeScript("window.scrollBy(0,5000);");//scroll down
		
		
		
		WebElement F = driver.findElement(By.linkText("France"));
		
		js.executeScript("arguments[0].click();",F);
	}

}
