package demopack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoSingleSelectdropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohd.hussain\\Desktop\\Faizan\\KRN\\chromedriver-win64\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.krninformatix.com/sample.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement singleSelect=driver.findElement(By.id("city")); 
		Select dd=new Select(singleSelect);
		dd.selectByIndex(2);
		
		Thread.sleep(3000);
		
		dd.selectByValue("1");
		
		Thread.sleep(3000);
		
		dd.selectByVisibleText("Delhi");
		Thread.sleep(3000);
		
		driver.quit();

	}

}
