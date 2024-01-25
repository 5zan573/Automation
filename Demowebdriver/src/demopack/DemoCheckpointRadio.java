package demopack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoCheckpointRadio {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohd.hussain\\Desktop\\Faizan\\KRN\\chromedriver-win64\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.krninformatix.com/sample.html");
		
		boolean radiostatus=driver.findElement(By.id("female")).isSelected();
		System.out.println(radiostatus);
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("female")).click();
		boolean radiostatus1=driver.findElement(By.id("female")).isSelected();
		System.out.println(radiostatus);
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("female")).click();
		boolean radiostatus2=driver.findElement(By.id("female")).isSelected();
		System.out.println(radiostatus2);
		
	}

}
