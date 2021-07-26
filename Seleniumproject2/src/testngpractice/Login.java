package testngpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {
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
  @Test
   void testcase2(){
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium downlods\\Drivers\\chromedriver.exe");
		
		 WebDriver bo = new ChromeDriver();
			 
	    bo.get("http://apps.qaplanet.in/hrm/login.php");
	    bo.findElement(By.className("loginText")).sendKeys("qaplbve1");
	    bo.findElement(By.name("txtPassword")).sendKeys("lab1");
	    bo.findElement(By.name("Submit")).click();
	    
	  if (bo.findElement(By.xpath("//font[contains(text(),'Invalid Login')]")).getText().equals("Invalid Login")) {
		  
		  System.out.println("pass");
		  
		
	}
	 
	  else {
		 System.out.println("fail");

	}
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
		 
		if (bo.findElement(By.xpath(null)).getText().equals("")) {
			System.out.println("pass");
			
			
		}
		
		else {
			System.out.println("fail");
			
		}
		
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
	    
	    if (bo.findElement(By.xpath("//font[contains(text(),'Invalid Login')]")).getText().equals("Invalid Login")) {
	    	System.out.println("pass");
			
		}
	    else {
			System.out.println("fail");
		}
	    bo.close();
	   
   }
   
   @Test
     
   void testcase5(){
	   
	   
	   
	   
	   
	   
   
	   
	   
   }
   
   
      
}

