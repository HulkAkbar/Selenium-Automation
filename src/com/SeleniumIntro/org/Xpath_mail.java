package com.SeleniumIntro.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_mail {


	
	public static void main(String[] args) throws InterruptedException {
		{
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Testing\\Drive\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.facebook.com/");
			
//   1)//tagName [@attributeName = 'attributeValue']
			
		   WebElement email = driver.findElement(By.xpath(""));
		   email. sendKeys("Ali@gmail.com");
		   
//   2)//tagName [contains{@attributeName, 'attributeValue')}  
		   
		   WebElement pass = driver.findElement(By.xpath(""));
		   pass. sendKeys("Akbar007");
		   
//    3)//tagName[text()= 'full text']
		   
		   driver.findElement(By.xpath("")).click();
		   
		   Thread.sleep(3000);
		   
		   driver.navigate().back();
		   
//    4)//tagName[contains(text(),'half of the text')]
		   
		   driver.findElement(By.xpath("")).click();
		   
		   Thread.sleep(3000);
		   
		   driver.navigate().back();
		   
//    5)(//tagName[@attributeName='attributeValue'])[index]
		   
		   driver.findElement(By.xpath("")).click();
		   
		  // driver.close();
		   
		   
		   
		   
	
	}

}
}