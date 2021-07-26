package testngpractice;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.base.Verify;

public class Testnglogin {
  @Test(enabled=true,priority=1,groups="login")
  public void testcase1() {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium downlods\\Drivers\\chromedriver.exe");
		
		 WebDriver bo = new ChromeDriver();
   bo.get("http://apps.qaplanet.in/hrm/login.php");

bo.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("qaplanet1");
bo.findElement(By.name("txtPassword")).sendKeys("lab1");
bo.findElement(By.className("button")).click();


System.out.println(bo.getTitle());
	
	Assert.assertEquals(bo.getTitle(), "OrangeHRM");
		
		//if (bo.getTitle().equals("OrangeHRM")) {
		
		
		bo.close();
		
  }
  
  @Test(enabled=true,priority=2,groups="login")
  void testcase2() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium downlods\\Drivers\\chromedriver.exe");
		
		 WebDriver bo = new ChromeDriver();
			 
	    bo.get("http://apps.qaplanet.in/hrm/login.php");
	    bo.findElement(By.className("loginText")).sendKeys("qaplbve1");
	    bo.findElement(By.name("txtPassword")).sendKeys("lab1");
	    bo.findElement(By.name("Submit")).click();
	    
	   Assert.assertEquals(bo.findElement(By.xpath("//font[contains(text(),'Invalid Login')]")).getText(), "Invalid Login");
	    
	 
	  bo.close();
	  
	  
	  
  }
  
  @Test
    void testcase3() throws InterruptedException{
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium downlods\\Drivers\\chromedriver.exe");
		
		 WebDriver bo = new ChromeDriver();
		 bo.get("http://apps.qaplanet.in/hrm/login.php");
		 bo.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
		 Thread.sleep(3000);
		 bo.findElement(By.name("txtPassword")).sendKeys("lab");
		 Thread.sleep(3000);
		 bo.findElement(By.name("Submit")).click();
		
		 Thread.sleep(3000);
		 
		Assert.assertEquals(bo.findElement(By.xpath("//font[contains(text(),'Invalid Login')]")).getText(),"Invalid Login");
		 
	   
       bo.close(); 
       
  }
  
  @Test
  
    void testcase4(){
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium downlods\\Drivers\\chromedriver.exe");
		
		 WebDriver bo = new ChromeDriver();
		 bo.get("http://apps.qaplanet.in/hrm/login.php");
		 
	    bo.findElement(By.name("txtUserName")).sendKeys("qaplanet123");
	    bo.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).sendKeys("labcd");
	    bo.findElement(By.name("Submit")).click();
	    
	  Assert.assertEquals(bo.findElement(By.xpath("//font[contains(text(),'Invalid Login')]")).getText(), "Invalid Login");
	    bo.close();
	  
	  
     
	  
     
     
     
     
     
     
     
	  
	  
  }
  
  @Test
  void testcase5(){
	  
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


