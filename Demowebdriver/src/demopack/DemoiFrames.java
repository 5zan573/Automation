package demopack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoiFrames {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohd.hussain\\Desktop\\Faizan\\KRN\\chromedriver-win64\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://krninformatix.com/frames/frames.html");
		
		driver.switchTo().frame(1);
		driver.findElement(By.name("name1")).sendKeys("Faizan");
		
		driver.switchTo().parentFrame();
		
		//driver.switchTo().frame("secondframe");
		//driver.findElement(By.name("rep")).click();
		
		WebElement frm=driver.findElement(By.xpath("//frame[@src='third.html']"));
		driver.switchTo().frame(frm);
        driver.findElement(By.name("check")).click();
        
 	}

}
