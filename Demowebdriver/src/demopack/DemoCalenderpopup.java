package demopack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoCalenderpopup {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohd.hussain\\Desktop\\Faizan\\KRN\\chromedriver-win64\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.redbus.com/");
		
		driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
		
		driver.findElement(By.xpath("//*[@id=\"rdc-root\"]/div/div[1]/div[2]/div[2]/div/div/div[1]/span/span[5]/div[5]/span")).click();
		
		

	}

}
