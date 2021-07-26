package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc_007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
   System.setProperty("webdriver.chrome.driver", "D:\\Selenium downlods\\Drivers\\chromedriver.exe");
			
	WebDriver bo = new ChromeDriver();
	bo.get("http://apps.qaplanet.in/hrm/login.php");
	
	bo.findElement(By.xpath("//a[contains(text(),'OrangeHRM')]")).click();
	
    System.out.println(bo.getTitle());
    if (bo.getTitle().equals("OrangeHRM - New Level of HR Management")) {
    	System.out.println("test case pass");
		
	}
    else {
		System.out.println("test case fail");
	}
    
    bo.close();
	
	

	}

}
