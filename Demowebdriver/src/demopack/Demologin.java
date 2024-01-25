package demopack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Demologin {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohd.hussain\\Desktop\\Faizan\\KRN\\chromedriver-win64\\chromedriver.exe\\");
		
		WebDriver driver=new ChromeDriver();
driver.get("https://practicetestautomation.com/practice-test-login/");

driver.findElement(By.id("username")).sendKeys("student");
driver.findElement(By.id("password")).sendKeys("Password123");
driver.findElement(By.id("submit")).click();



	}

}
