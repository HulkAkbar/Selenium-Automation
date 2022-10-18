package com.SeleniumIntro.org;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Testing\\NewDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//Implicit wait
		
		driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Ali");
		
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Akbar");
		
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("xxxxxxxxxxxx");
		
		
		//Explicit wait
		
	    WebElement gender = driver.findElement(By.xpath("//input[@value='Male']"));
	    gender.click();
	    
	    WebDriverWait wait = new   WebDriverWait(driver,40);
	    wait.until(ExpectedConditions.visibilityOf(gender));
	    
	    WebElement radio = driver.findElement(By.id("checkbox1"));
	    radio.click();
	    
	    driver.close();	    
		
	}

}
