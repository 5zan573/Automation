package demopack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoJavascriptConfirmation {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohd.hussain\\Desktop\\Faizan\\KRN\\chromedriver-win64\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.krninformatix.com/selenium/testing.html");

		driver.findElement(By.xpath("//button[text()='Generate Confirm Box']")).click();
		Thread.sleep(3000);
		Alert alt=driver.switchTo().alert();
		alt.dismiss();
		Thread.sleep(3000);
		
	    driver.findElement(By.xpath("//button[text()='Generate Confirm Box']")).click();
	    Thread.sleep(3000);
	    String text=alt.getText();
		System.out.println(text);
		alt.accept();
		
		
	}

}
