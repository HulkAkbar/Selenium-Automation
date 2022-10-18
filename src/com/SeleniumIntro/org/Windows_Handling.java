package com.SeleniumIntro.org;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windows_Handling {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Testing\\NewDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		Actions a = new Actions(driver);
		
		WebElement mobiles = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		a.contextClick(mobiles).build().perform();
	
	Robot r = new Robot();
	
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	Thread.sleep(2000);
	
	WebElement books = driver.findElement(By.xpath("//a[text()='Books']"));
	a.contextClick(books).build().perform();
	
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	Set<String> windowHandles = driver.getWindowHandles();
	for (String id : windowHandles) {
		
		String title = driver.switchTo().window(id).getTitle();
		System.out.println(title);
	}
	
	String elect="Book Store Online : Buy Books Online at Best Prices in India | Books Shopping @ Amazon.in";
		for (String id1 : windowHandles) {
				if(driver.switchTo().window(id1).getTitle().equals(elect));{
					break;
				}
				
			}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
