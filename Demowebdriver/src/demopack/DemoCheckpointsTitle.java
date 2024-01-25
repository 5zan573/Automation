package demopack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoCheckpointsTitle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohd.hussain\\Desktop\\Faizan\\KRN\\chromedriver-win64\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://online.actitime.com/faizan/login.do");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String expectedTitle="actiTIME - Login";
		String actualTitle=driver.getTitle();
		
		if (expectedTitle.equals(actualTitle)) {
			
			System.out.println("Pass");
			
		} 
		else {
			System.out.println("Fail");
		}
		

	}

}
