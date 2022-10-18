package com.SeleniumIntro.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Testing\\Drive\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://testleaf.herokuapp.com/pages/frame.html");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		WebElement frame1 = driver.findElement(By.id("Click"));
		frame1.click();
		
		String text = frame1.getText();
		
		System.out.println("Frame1*"+text);
		
		driver.switchTo().defaultContent();
		
		
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		
		WebElement frame2 = driver.findElement(By.id("Click1"));
		frame2.click();
		
		String text1 = frame2.getText();
		
		System.out.println("Frame2*"+text1);
		
		driver.switchTo().defaultContent();
		
		List<WebElement> count = driver.findElements(By.tagName("iframe"));
		
		int size = count.size();
		
		System.out.println("Size*"+size);
		driver.close();
		
		
	}

}
