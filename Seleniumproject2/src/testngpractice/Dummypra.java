package testngpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Dummypra {
  @Test
  public void testcase5() {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium downlods\\Drivers\\chromedriver.exe");
		
		 WebDriver bo = new ChromeDriver();
		 bo.get("http://apps.qaplanet.in/hrm/login.php");
			 
		   bo.findElement(By.name("txtUserName")).sendKeys("");
		   bo.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).sendKeys("");
		   bo.findElement(By.name("Submit")).click();
		   System.out.println(bo.switchTo().alert().getText()); 
		 Assert.assertEquals(bo.switchTo().alert().getText(), "User Name not given!");
		 
		 bo.switchTo().alert().accept();
		 bo.close();
		 
		 
  }
}
