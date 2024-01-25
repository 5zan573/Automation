package demopack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoActions {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohd.hussain\\Desktop\\Faizan\\KRN\\chromedriver-win64\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.krninformatix.com/");

		WebElement coursesoffered=driver.findElement(By.xpath("//a[text()='Courses Offered']"));
		WebElement ST=driver.findElement(By.xpath("//a[text()='Software Testing']"));
		WebElement STr=driver.findElement(By.xpath("//a[text()='Selenium Training']"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(coursesoffered).perform();
		Thread.sleep(3000);
		act.moveToElement(ST).perform();
		Thread.sleep(3000);
		act.moveToElement(STr).perform();
		Thread.sleep(3000);
		
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		
		act.sendKeys(Keys.ALT).build();
		act.sendKeys(Keys.CONTROL).build();
		act.sendKeys(Keys.DELETE).perform();
		
	}

}
