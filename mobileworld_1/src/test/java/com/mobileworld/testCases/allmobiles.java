package com.mobileworld.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class allmobiles {
	WebDriver driver;
	public allmobiles(WebDriver driver)
	{
	this.driver=driver;
	}
	By allmobile=By.xpath("//a[text()='All Mobiles']");
	By search=By.xpath("//input[@placeholder='Search your Mobile name here']");
	public WebElement allmobile()
	{
	return driver.findElement(allmobile);
	}
	public WebElement search()
	{
	return driver.findElement(search);
	}

	
}
