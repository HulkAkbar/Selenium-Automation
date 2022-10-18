package com.SeleniumIntro.org;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Project {
	
public static void main(String[] args) throws IOException, InterruptedException {
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Testing\\NewDriver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://adactinhotelapp.com/index.php");
	
	driver.manage().window().maximize();
	
	WebElement username = driver.findElement(By.id("username"));
	username.sendKeys("Aliakbar007");
	
	WebElement password = driver.findElement(By.id("password"));
	password.sendKeys("15022001");
	
	TakesScreenshot ts = (TakesScreenshot) driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	File destination=new File("C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Testing\\Mini_Project\\mp.png");
	FileUtils.copyFile(source, destination);
	
	driver.findElement(By.id("login")).click();
	
	Thread.sleep(2000);
	
	WebElement place = driver.findElement(By.id("location"));
	Select a = new Select(place);
	a.selectByValue("New York");
	
	WebElement hotel = driver.findElement(By.id("hotels"));
	Select b = new Select(hotel);
	b.selectByIndex(4);
	
	WebElement room = driver.findElement(By.id("room_type"));
	Select c = new Select(room);
	c.selectByVisibleText("Super Deluxe");
	
	WebElement roomno = driver.findElement(By.id("room_nos"));
	Select d = new Select(roomno);
	d.selectByValue("5");
	
	WebElement datein = driver.findElement(By.id("datepick_in"));
	datein.clear();
	datein.sendKeys("05/09/2022");
	
	WebElement dateout = driver.findElement(By.id("datepick_out"));
	dateout.clear();
	dateout.sendKeys("10/09/2022");
	
	WebElement adult = driver.findElement(By.id("adult_room"));
	Select e = new Select(adult);
	e.selectByIndex(3);
	
	WebElement child = driver.findElement(By.id("child_room"));
	Select f = new Select(child);
	f.selectByVisibleText("2 - Two");
	
	Thread.sleep(2000);
	
	TakesScreenshot ts1 = (TakesScreenshot) driver;
	File source1 = ts1.getScreenshotAs(OutputType.FILE);
	File destination1=new File("C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Testing\\Mini_Project\\mp1.png");
	FileUtils.copyFile(source1, destination1);
	
	driver.findElement(By.id("Submit")).click();
	
	driver.findElement(By.id("radiobutton_0")).click();
	
	Thread.sleep(2000);
	
	driver.findElement(By.id("continue")).click();
	
	WebElement firstname = driver.findElement(By.id("first_name"));
	firstname.sendKeys("Ali");
	
	WebElement lastname = driver.findElement(By.id("last_name"));
	lastname.sendKeys("Akbar");
	
	WebElement address = driver.findElement(By.id("address"));
	address.sendKeys("No.1/2,Kattabooman Street,Vengateshwara Nagar,Ramapuram,Chennai 600089");
	
	WebElement ccno = driver.findElement(By.id("cc_num"));
	ccno.sendKeys("1234567890123456");
	
	WebElement cc = driver.findElement(By.id("cc_type"));
	Select g = new Select(cc);
	g.selectByValue("VISA");
	
	WebElement ccexpm = driver.findElement(By.id("cc_exp_month"));
	Select h = new Select(ccexpm);
	h.selectByIndex(2);
	
	WebElement ccexpy = driver.findElement(By.id("cc_exp_year"));
	Select i = new Select(ccexpy);
	i.selectByVisibleText("2020");
	
	WebElement cvv = driver.findElement(By.id("cc_cvv"));
	cvv.sendKeys("123");
	
	Thread.sleep(2000);
	
	driver.findElement(By.id("book_now")).click();
	
	Thread.sleep(8000);
	
	TakesScreenshot ts2 = (TakesScreenshot) driver;
	File source2 = ts2.getScreenshotAs(OutputType.FILE);
	File destination2=new File("C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Testing\\Mini_Project\\mp2.png");
	FileUtils.copyFile(source2, destination2);
	
	
	
	JavascriptExecutor j = (JavascriptExecutor)driver;
	
	j.executeScript("window.scrollBy(0,2000);");
	
	driver.findElement(By.id("logout")).click();
	
	Thread.sleep(2000);
	
	
	TakesScreenshot ts3 = (TakesScreenshot) driver;
	File source3 = ts3.getScreenshotAs(OutputType.FILE);
	File destination3=new File("C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Testing\\Mini_Project\\mp3.png");
	FileUtils.copyFile(source3, destination3);
	
	driver.close();	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
		
		
	
		


}
