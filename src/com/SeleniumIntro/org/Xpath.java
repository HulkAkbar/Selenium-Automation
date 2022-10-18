package com.SeleniumIntro.org;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	 
	public static void main(String[] args) throws IOException, InterruptedException {
		
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Testing\\Drive\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.facebook.com/");
			
//   1)//tagName [@attributeName = 'attributeValue']
			
		   WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
		   email. sendKeys("Ali@gmail.com");
		   
//   2)//tagName [contains{@attributeName, 'attributeValue')}  
		   
		   WebElement pass = driver.findElement(By.xpath("//input[contains(@type,'pass')]"));
		   pass. sendKeys("Akbar007");
		   
//    3)//tagName[text()= 'full text']
		   
		   driver.findElement(By.xpath("//button[text()='Log In']")).click();
		   		   
           TakesScreenshot ts1 = (TakesScreenshot)driver;
		   
		   File source1 = ts1.getScreenshotAs(OutputType.FILE);
		   File destination1 = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Testing\\Screenshot\\fb01.png");
		   
		  FileUtils.copyFile(source1, destination1);
		   
		   driver.navigate().back();
		   
//    4)//tagName[contains(text(),'half of the text')]
		   
		   driver.findElement(By.xpath("//a[contains(text(),'Forgotten ')]")).click();
		   
		   Thread.sleep(2000);
		    
//           TakesScreenshot ts2 = (TakesScreenshot)driver;
//
//		   
//		   File source2 = ts2.getScreenshotAs(OutputType.FILE);
//		   File destination2 = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Testing\\Screenshot\\fb02.png");
//		   
//		  FileUtils.copyFile(source2, destination2);
		   
		   driver.navigate().back();
		   
//    5)(//tagName[@attributeName='attributeValue'])[index]
		   
		   driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		   
		   //Takescreenshot
		   
		   Thread.sleep(2000);
		   
//		   TakesScreenshot ts3 = (TakesScreenshot)driver;
//		   
//		   File source3 = ts3.getScreenshotAs(OutputType.FILE);
//		   File destination3 = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Testing\\Screenshot\\fb03.png");
//		   
//		  FileUtils.copyFile(source3, destination3);
//		  
//		   
		   driver.close();
		   
		   
		}
	}


