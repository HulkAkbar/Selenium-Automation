package com.SeleniumIntro.org;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {
	
	public static void main(String[] args) throws AWTException {
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Testing\\NewDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/buttons");
		
		driver.manage().window().maximize();
		
		Actions a = new Actions(driver);
		
	WebElement db = driver.findElement(By.id("doubleClickBtn"));
	a.doubleClick(db).build().perform();
	
	WebElement rc = driver.findElement(By.id("rightClickBtn"));
	a.contextClick(rc).build().perform();
	
	WebElement cl = driver.findElement(By.xpath("(//button[@type='button'])[4]"));
	a.click(cl).build().perform();
	
	driver.navigate().to("https://www.google.com/");
	
	WebElement images = driver.findElement(By.linkText("Images"));
	
	a.contextClick(images).build().perform();
	
	Robot r = new Robot();
	
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
//	driver.quit();
	
	
	
	
	
	
	}
	

}
