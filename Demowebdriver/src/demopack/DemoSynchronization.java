package demopack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.thoughtworks.selenium.Wait;

public class DemoSynchronization {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohd.hussain\\Desktop\\Faizan\\KRN\\chromedriver-win64\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://online.actitime.com/faizan/timetrack/enter.do");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.id("username")).sendKeys("faizanhussain573@gmail.com");
        driver.findElement(By.name("pwd")).sendKeys("BoAt@2023");
        driver.findElement(By.xpath("//div[text() ='Login ']")).click();
        
        WebDriverWait wait=new WebDriverWait(driver, 25);
        
        wait.until(ExpectedConditions.elementToBeClickable(By.id("//a[@class='logout']")));
        
        driver.findElement(By.xpath("//a[@class='logout']")).click();
        
	
	
		
	}

}
