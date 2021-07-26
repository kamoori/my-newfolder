package seleniumpractice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orangehrm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium downlods\\Drivers\\chromedriver.exe");
		
		 WebDriver bo = new ChromeDriver();
		 bo.manage().window().maximize();
		 bo.get("http://apps.qaplanet.in/hrm/login.php");
		
		 bo.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
		 bo.findElement(By.id("")).sendKeys("lab1");
		 
		 
		 
	}

}
