package com.mobileworld.testCases;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BaseClass {
		public WebDriver driver;
		@Test
		public void Appliction_Lunch() throws InterruptedException
			{
				System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
				driver= new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				driver.get("https://mobileworld.azurewebsites.net/");
				mobwdsignup Mwsignup=new mobwdsignup(driver);
				Mwsignup.signin().click();
				Mwsignup.signup().click();
				Mwsignup.firstname().sendKeys("Abhilash");
				Mwsignup.lastname().sendKeys("Shetty");
				Mwsignup.emailid().sendKeys("abcd123@gmail.com");
				Mwsignup.password().sendKeys("abcdefg123");
				Mwsignup.date().sendKeys("07/11/1998");
				Mwsignup.genderM().click();
				Mwsignup.phone().sendKeys("9876543210");
				Mwsignup.bio().sendKeys("hi i am from banglore");
				Mwsignup.register().click();
				driver.switchTo().alert().accept();
				Thread.sleep(4000);
				Mwsignup.signinbtn().click();
				driver.switchTo().alert().accept();
			}
			@Test(priority=1)
			public void signin() throws InterruptedException
			{
				mobwdsignin Mwsin=new mobwdsignin(driver);
				Mwsin.uname.sendKeys("Abhilash");
				Mwsin.pwd.sendKeys("abcdefg123");
				Thread.sleep(4000);
				Mwsin.loginbtn.click();
				
			}
			
			@Test(priority=2)
			public void homepage() throws InterruptedException
			{
				Home hp=new Home(driver);
				String text=driver.getTitle();
				System.out.println(text);
				
				hp.latest().click();
				hp.samsung().click();
				hp.moredetails().click();
				driver.navigate().back();
				Thread.sleep(3000);
				hp.contactus().click();	  
				
			}
			
			@Test(priority=3)
			public void Order()
			{
				Orderpage op=new Orderpage(driver);
				op.select().click();
				op.order().click();
				Set<String> window = driver.getWindowHandles();
				List<String> list=new ArrayList<String>(window);
				driver.switchTo().window(list.get(1));
				op.firstname().sendKeys("Abhilash");
				op.lastname().sendKeys("shetty");
				op.emailid().sendKeys("abcd12345@gmail.com");
				op.password().sendKeys("abcd12345@");
				op.gender().click();
				op.number().sendKeys("9876543210");
				op.adress1().sendKeys("#123,2nd main");
				op.adress2().sendKeys("kkcross");
				op.city().sendKeys("blr");
				Select option=new Select(op.state());
				option.selectByIndex(1);
				op.zip().sendKeys("67890");
				op.apple().click();
				op.count().sendKeys("2");
				op.dropyes().click();
				op.clickNO().click();
				op.check1().click();
				
			}
			@Test(priority=4)
			public void allmob()
			{
				allmobiles am=new allmobiles(driver);
				String text=driver.getTitle();
				System.out.println(text);
				
				am.allmobile().click();
				am.search().click();
				
			}


		@AfterSuite
		public void close_Application()
		{
			driver.quit();
		}
}
