package com.SeleniumIntro.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Testing\\NewDriver\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.techlistic.com/p/demo-selenium-practice.html");
		
		driver.manage().window().maximize();
		
		//All Data
		
		System.out.println("*****all data*******");
		
		List<WebElement>  alldata = driver.findElements(By.xpath("//tbody/tr/td"));
		
		for (WebElement wb : alldata) {
			
			System.out.println(wb.getText());
		}
			
			
			
	//Specific row data
			
			System.out.println("******spec row*******");
			
			List<WebElement> rowdata = driver.findElements(By.xpath("//tbody/tr[4]/td"));
			
			for (WebElement wb1 : rowdata) {
				
				System.out.println(wb1.getText());
			}
				
	//Specific Column data
				
				System.out.println("*****spec column*****");
				
				List<WebElement> columndata = driver.findElements(By.xpath("//tbody/tr/td[2]"));
				
				for (WebElement wb2 : columndata) {
					
					System.out.println(wb2.getText());
				}
					
					
					Thread.sleep(2000);
					
					
	//Specific	data
					
					System.out.println("*****spec data*******");
					
					WebElement findElement = driver.findElement(By.xpath("//td[text()='Canada']"));
					
					System.out.println(findElement.getText());
					
					
				
				
				driver.close();
	}
}
				
					
					
			
