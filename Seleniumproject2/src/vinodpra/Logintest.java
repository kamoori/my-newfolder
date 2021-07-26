package vinodpra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Logintest {
  @Test
  public void testcase1() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium downlods\\Drivers\\chromedriver.exe");
		
		 WebDriver bo = new ChromeDriver();
   bo.get("http://apps.qaplanet.in/hrm/login.php");

bo.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("qaplanet1");
bo.findElement(By.name("txtPassword")).sendKeys("lab1");
bo.findElement(By.className("button")).click();


System.out.println(bo.getTitle());
		
		
		if (bo.getTitle().equals("OrangeHRM")) {
			System.out.println("testcase pass");
			
		}
	
		else {
			System.out.println("testcase fail");
		}
		
		bo.close();
		
	  
  }
}
