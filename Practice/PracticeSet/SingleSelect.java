package PracticeSet;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelect {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\mohd.hussain\\Desktop\\Faizan\\KRN\\chromedriver-win64\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.krninformatix.com/sample.html");
		
		WebElement dd=driver.findElement(By.id("city"));
		
		Select Select=new Select(dd);
		
		Select.selectByIndex(2);
		
		List<WebElement> allselected=Select.getAllSelectedOptions();
		
	    int si=allselected.size();
		
		System.out.println(si);
		
		}
		
		
		
		
		
	}

