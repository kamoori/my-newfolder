package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc_002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
	

		
}	
    
    
    
    
    
   
   
    
    



