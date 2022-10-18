package com.SeleniumIntro.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_DropDown {
	
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Testing\\Drive\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://demoqa.com/select-menu/");
	
	driver.manage().window().maximize();
	
//	WebElement multi = driver.findElement(By.xpath("//div[text()='Select...']"));
	
   //	Select a=new Select(multi);
	 
//	 a.selectByVisibleText("Green");
//	 a.selectByVisibleText("Blue");
//	 a.selectByVisibleText("Red");
	 
	 Thread.sleep(2000);
	
	WebElement multi1= driver.findElement(By.xpath("(//select)[2]"));
	 
	 Select s=new Select(multi1);
	 
	 s.selectByIndex(3);
	 s.selectByValue("opel");
	 s.selectByVisibleText("Volvo");
	 
	// s.deselectByIndex(1);
	 
	 boolean multiple = s.isMultiple();
	 System.out.println(multiple);
	 
	System.out.println("****ALL SELECTED OPTIONS******");

	 List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
	
	for (WebElement webElement : allSelectedOptions  ) {
		System.out.println(webElement.getText());
		
	}
	
	System.out.println("******FIRST SELECTED OPTION*******");
	
	WebElement firstSelectedOption = s.getFirstSelectedOption();
	System.out.println(firstSelectedOption.getText());
	
	System.out.println("*****OPTIONS******");
	
	List<WebElement> options = s.getOptions();
	for (WebElement wb : options) {
	System.out.println(wb.getText());
	}
	
	Thread.sleep(2000);
	s.deselectAll();
	
	driver.close();
	
	
	
	
}

}
