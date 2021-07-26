package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc_003 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
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

}
