package demopack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoJavascriptAlert {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohd.hussain\\Desktop\\Faizan\\KRN\\chromedriver-win64\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.krninformatix.com/selenium/testing.html");
		
		driver.findElement(By.xpath("//button[text()='Generate Alert Box']")).click();
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Generate Alert Box']")).click();
		Thread.sleep(3000);
		String alttext=driver.switchTo().alert().getText();
		System.out.println(alttext);
		driver.switchTo().alert().accept();
		
		
		

	}

}
