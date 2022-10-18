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
import org.openqa.selenium.support.ui.Select;

public class Drop_Down {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Testing\\Drive\\chromedriver.exe");
		
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		

		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Ali");
		
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Akbar");
		
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("8682905120");
		
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Akbar007");
		
		WebElement day = driver.findElement(By.id("day"));

		Select s = new Select(day);
		
		s.selectByIndex(14);
		
		WebElement month = driver.findElement(By.id("month"));
		
		Select s1 = new Select(month);
		
		s1.selectByIndex(1);
		
		WebElement year = driver.findElement(By.id("year"));
		
		Select s2 = new Select(year);
		
		s2.selectByValue("2001");
		
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		
		
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
		Thread.sleep(2000);
		
        TakesScreenshot ts = (TakesScreenshot)driver;
		
		File srcfile = ts.getScreenshotAs(OutputType.FILE);
		
		File destfile= new File("C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Testing\\Screenshot\\fb04.png");
		
		FileUtils.copyFile(srcfile, destfile);
		
		driver.close();
	}

}
