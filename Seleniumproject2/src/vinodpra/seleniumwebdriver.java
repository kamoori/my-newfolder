package vinodpra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class seleniumwebdriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\Selenium downlods\\Driver new\\chromedriver.exe");
			
     WebDriver bo = new ChromeDriver();
     
     bo.get("https://chandanachaitanya.github.io/selenium-practice-site/");
     bo.manage().window().maximize();
     bo.findElement(By.xpath("//input[@id='bicycle-checkbox']")).click();
     bo.findElement(By.xpath("//input[@id='magazines-radio-btn']")).click();
     Select listfield = new Select(bo.findElement(By.xpath("//select[@id='programming-languages']")));
     //listfield.selectByIndex(2);
     //listfield.selectByVisibleText("JavaScript");
     listfield.selectByValue("");


	}

}
