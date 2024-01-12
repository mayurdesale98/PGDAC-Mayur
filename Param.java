package com.testng;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Param {
	 WebDriver obj;
  @Parameters({"ius","iow"})
  @Test(priority = 1)
  public void Login(String ius, String iow) {
	  System.setProperty("webdriver.chrome.driver","D:\\SeleniumDemo\\selenium data\\chromedriver-win64\\chromedriver.exe");
	 obj=new ChromeDriver();
	  obj.get("https://www.demo.guru99.com/V4/");
	  
	  obj.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).sendKeys(ius);
	  obj.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys(iow);
	  
	  obj.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
	  
	  Alert a1= obj.switchTo().alert();
	  a1.accept();
	  obj.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).clear();
	  obj.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).clear();
  }
  
  @Parameters({"us","ow"})
  @Test(priority = 2)
  public void Login2(String us, String ow) {
	  obj.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).sendKeys(us);
	  obj.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys(ow);
	  
	  obj.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
	  
	  
	  
  }
  
}
