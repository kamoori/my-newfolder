package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc_004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

}
