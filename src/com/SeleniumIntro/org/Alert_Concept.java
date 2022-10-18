package com.SeleniumIntro.org;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Concept {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Testing\\Drive\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://testleaf.herokuapp.com/pages/Alert.html");
		
		driver.manage().window().maximize();
		
		// 1)Simple Alert
		
	    driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
	
		Alert simple = driver.switchTo().alert();
		Thread.sleep(3000);
		System.out.println(simple.getText());
		simple.accept();
	    
		
		
		// 2)Confrim Alert
		
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		
		Alert confrim = driver.switchTo().alert();
	    Thread.sleep(2000);
		confrim.dismiss();
		
		// 3)Prompt Alert
		
		
		driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
	
		Alert prompt = driver.switchTo().alert();
		prompt.sendKeys("AliAkbar");
		prompt.accept();
		Thread.sleep(2000);
		
	    driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		}


}
