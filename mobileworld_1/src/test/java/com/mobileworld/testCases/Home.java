package com.mobileworld.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home{
	WebDriver driver;
	
	public Home(WebDriver driver)
	{
		this.driver=driver;
	}
	@FindBy (id="navbarDropdown")
	WebElement latest;
	
	@FindBy(xpath="//a[text()='Samsung']")
	WebElement samsung;
	
	@FindBy(xpath="//a[text()='More Details']")
	WebElement moredetails;
	
	@FindBy(xpath="//a[text()='Order' and @class='dropdown-item']")
	WebElement order;
	
	@FindBy(xpath="//a[@text()='Contact Us']")
	WebElement contactus;
	
	@FindBy(xpath="//button[@id='btn-back-to-top;]")
	WebElement upparrow;
	
	public WebElement latest()
	{
		return latest;
		
	}
	public WebElement samsung()
	{
		return samsung;
	}
	public WebElement moredetails()
	{
		return moredetails;
	}
	public WebElement order()
	{
		return order;
	}
	public WebElement contactus()
	{
		return contactus;
	}
	public WebElement upparrow()
	{
		return upparrow;
	}
}
