package com.mobileworld.testCases;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;



	public class mobwdsignup {
	WebDriver driver;
	public mobwdsignup (WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[text()='SIGN IN']")
	WebElement signin;

	@FindBy(xpath="//a[text()='Sign up']")
	WebElement signup;

	@FindBy(xpath="//input[@placeholder='First Name']")
	WebElement firstname;

	@FindBy(xpath="//input[@placeholder='Last Name']")
	WebElement lastname;

	@FindBy(xpath="//input[@placeholder='Enter Email']")
	WebElement emailid;

	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement password;

	@FindBy(xpath="//input[@type='date']")
	WebElement date;

	@FindBy(xpath="//input[@type='radio']")
	WebElement genderM;

	@FindBy(xpath="//label[text()='Female']")
	WebElement genderF;

	@FindBy(xpath="//input[@placeholder='91XXXXXXXXXX']")
	WebElement phone;

	@FindBy(xpath="//textarea[@placeholder='Short Bio']")
	WebElement bio;

	@FindBy(xpath="//button[text()='Register']")
	WebElement register;

	@FindBy(xpath="//button[text()='Sign In']")
	WebElement signinbtn;

	public WebElement signin()
	{
	return signin;
	}
	public WebElement signup()
	{
	return signup;
	}
	public WebElement firstname()
	{
	return firstname;
	}
	public WebElement lastname()
	{
	return lastname;
	}
	public WebElement emailid()
	{
	return emailid;
	}
	public WebElement password()
	{
	return password;
	}
	public WebElement date()
	{
	return date;
	}
	public WebElement genderM()
	{
	return genderM;
	}
	public WebElement genderF()
	{
	return genderF;
	}
	public WebElement phone()
	{
	return phone;
	}
	public WebElement bio()
	{
	return bio;
	}
	public WebElement register()
	{
	return register;
	}
	public WebElement signinbtn()
	{
	return signinbtn;
	}

}

