package com.SeleniumIntro.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Testing\\Drive\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		
		System.out.println("EMAIL");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("Akbar@gmail.com");
	
	    boolean displayed = email.isDisplayed();
		System.out.println("Display:"+ displayed);
		
	    boolean enabled = email.isEnabled();
		System.out.println("Enabled:"+ enabled);
		
		boolean selected = email.isSelected();
		System.out.println("Slected:"+ selected);
		
		String attribute = email.getAttribute("name");
			System.out.println(attribute);
			
//			Thread.sleep(2000);
			System.out.println(" ");
			
			System.out.println("PASSWORD");
		
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("Akbar02");
	
		boolean displayed1 = pass.isDisplayed();
		System.out.println("Display:"+ displayed1);
		
		boolean enabled1 = pass.isEnabled();
		System.out.println("Enabled:"+ enabled1);
		
		boolean selected1 = pass.isSelected();
		System.out.println("Slected:"+ selected1);
		
		String attribute2 = pass.getAttribute("value");
		System.out.println(attribute2);
		
		
		
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		
		Thread.sleep(2000);
		
		
	   driver.close();		
	}

}
