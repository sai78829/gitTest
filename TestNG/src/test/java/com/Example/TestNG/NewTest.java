package com.Example.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

@Test
public class NewTest 
{
 
  App a1;
  @DataProvider(name= "data")
  public Object[][] dp()
  {
	return new Object[][] {new Object[] { 1, 2, 3 },new Object[] { 1, -2, -1 },new Object[] {-1,-2,-3},new Object[] {0,-2,-2},new Object[] {0,0,0},new Object[] {-1,2,1},};
  }
  @BeforeTest
  public void beforeTest() 
  {
	  a1=new App();
	  System.out.println("Inside Before test");
  }

  @AfterTest()
  public void afterTest() {
	  System.out.println("Inside After test");
  }
@Test(dataProvider="data",priority=2)
  public void addTest(int a , int b, int result) 
  {
	  System.out.println("Inside add test");
	  int r=a1.add(a, b);
	  assertEquals(result,r);
  }
@Test(priority=1)
  public void subtractTest(int a , int b, int result) 
  {
	  System.out.println("Inside subtract test");
	  int resu=a1.subtract(a, b);
	  assertEquals(result,resu);
  }
  /*public void subtractTest1() 
  {
	  System.out.println("Inside subtract test");
	  int res=a1.subtract(1, 2);
	  assertEquals(-1,res);
  }*/
}
