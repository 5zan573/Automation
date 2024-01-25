package demopack;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoMultiSelectdropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohd.hussain\\Desktop\\Faizan\\KRN\\chromedriver-win64\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.krninformatix.com/sample.html");
		
		WebElement dd=driver.findElement(By.id("cities"));
		Select sl=new Select(dd);
		sl.selectByValue("3");
		Thread.sleep(2000);
		sl.selectByIndex(1);
		Thread.sleep(2000);	
			
		List<WebElement> alloptions=sl.getOptions();
		
		int si=alloptions.size();
		
		for (int i=0; i<si; i++) {
		
		WebElement option1=alloptions.get(i);
		String text=option1.getText();
		System.out.println(text);
		
		}
		

	}
}

