package com.Example.TestNG;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Guru99LoginPage {
	String url="https://demo.guru99.com/test/login.html";
	WebDriver driver;
  @Test
  public void f() {
  }
  @BeforeTest
  public void beforeTest() throws Exception 
  {
	  WebDriverManager.chromedriver().setup();
	  driver =new ChromeDriver();
	  driver.get(url);
	  WebElement username=driver.findElement(By.id("email"));
	  username.clear();
	  username.sendKeys("lakshmisai788@gmail.com");
	  Thread.sleep(5000);
	  WebElement password=driver.findElement(By.id("passwd"));
	  username.clear();
	  password.sendKeys("Arjun@1234");
	  WebElement signin=driver.findElement(By.id("SubmitLogin"));
	  signin.click();
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
