package com.mobileworld.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class mobwdsignin {
	WebDriver driver;
	public mobwdsignin(WebDriver driver)
	{
		this.driver=driver;
	}
	@FindBy(id="username")
	WebElement uname;
	
	@FindBy(id="password")
	WebElement pwd;
	
	@FindBy(className="btn btn-primary btn-block")
	WebElement loginbtn;
	
	public WebElement uname() {
		return uname;
	}
	public WebElement password() {
		return pwd;
	}
	public WebElement loginbtn() {
		return loginbtn;
	}
}	
	
	
	