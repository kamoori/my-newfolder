package actinpra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actioncammandpra {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium downlods\\Drivers\\chromedriver.exe");
		
		 WebDriver bo = new ChromeDriver();
		 Actions actionobject = new Actions(bo);
		 
		 bo.get("http://apps.qaplanet.in/hrm/login.php");
		  
	      bo.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("qaplanet1");
	      bo.findElement(By.name("txtPassword")).sendKeys("lab1");
	      bo.findElement(By.xpath("//tbody/tr[4]/td[1]/input[1]")).click();
	     

	      actionobject.moveToElement(bo.findElement(By.xpath("//body/div[@id='top-menu']/ul[@id='nav']/li[@id='admin']/a[1]/span[1]"))).perform();
	      Thread.sleep(3000);
	   
	     actionobject.moveToElement(bo.findElement(By.xpath("//body[1]/div[4]/ul[1]/li[1]/ul[1]/li[2]/a[1]/span[1]"))).perform();
	     Thread.sleep(3000);
	     
	     actionobject.moveToElement(bo.findElement(By.xpath("//body[1]/div[4]/ul[1]/li[1]/ul[1]/li[4]/a[1]/span[1]"))).perform();
	     Thread.sleep(3000);
	    // bo.findElement(By.xpath("//body[1]/div[4]/ul[1]/li[1]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[1]")).click();
	     Thread.sleep(3000);
	     actionobject.moveToElement(bo.findElement(By.xpath("//body[1]/div[4]/ul[1]/li[1]/ul[1]/li[5]/a[1]/span[1]"))).perform();
	     
	     bo.findElement(By.xpath("//body[1]/div[4]/ul[1]/li[1]/ul[1]/li[5]/ul[1]/li[2]/a[1]/span[1]")).click();
	     
	     
	}
	


}
