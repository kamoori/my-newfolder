package seleniumpractice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browserrun1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium downlods\\Drivers\\chromedriver.exe");
		
	 WebDriver bo = new ChromeDriver();
	 bo.get("https://www.redbus.in/");
	 bo.manage().window().maximize();
	 bo.findElement(By.xpath("//input[@id='src']")).sendKeys("hyd");
	 Thread.sleep(3000);
	 bo.findElement(By.xpath("//input[@id='dest']")).sendKeys("bengare");
	 Thread.sleep(3000);
	 System.out.println(bo.getTitle());
	 Thread.sleep(3000);
	 System.out.println(bo.getCurrentUrl());
	 
	 bo.findElement(By.xpath("//header/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]")).click();
	 bo.findElement(By.xpath("//button[@id='search_btn']")).click();
	 
	 
	 
	 
	 
	
	
	 
	}

}
















