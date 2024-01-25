package demopack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoCheckpointText {

	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohd.hussain\\Desktop\\Faizan\\KRN\\chromedriver-win64\\chromedriver.exe\\");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://online.actitime.com/faizan/login.do");
	
	driver.findElement(By.id("username")).sendKeys("faizanhussain573@gmail.com");
    driver.findElement(By.name("pwd")).sendKeys("BoAt@2023");
    driver.findElement(By.xpath("//div[text() ='Login ']")).click();
    
    String expectedtext="Enter Time-Track for";
    String actualtext=driver.findElement(By.xpath("//h3[text()='Enter Time-Track']")).getText();
    
    if (expectedtext.equals(actualtext)) {
    	System.out.println("Pass");
    }
    	else { System.out.println("Fail");
    		
    	}
    	
    }
	
	

	}
