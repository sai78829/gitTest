package com.Example.TestNG;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;

public class AmazonTest {
	String url="https://www.amazon.com";
	WebDriver driver;
	String Actualtitle="Amazon.com. Spend less. Smile more.";
  @Test
  public void f() 
  {
	  String title=driver.getTitle();
	  assertEquals(Actualtitle,title);
  }
  @BeforeTest
  public void beforeTest() 
  {
	 
	  
	  //System.setProperty("webdriver.chrome.driver"," ");
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.get(url);
  }

  
@AfterTest
  public void afterTest() 
  {
	  driver.close();
  }

}
