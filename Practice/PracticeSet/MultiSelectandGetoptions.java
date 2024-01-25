package PracticeSet;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectandGetoptions {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\mohd.hussain\\Desktop\\Faizan\\KRN\\chromedriver-win64\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.krninformatix.com/sample.html");
		
		WebElement city=driver.findElement(By.id("cities"));
		Select sl=new Select(city);
		sl.selectByVisibleText("Delhi");
		Thread.sleep(2000);
        sl.selectByIndex(1);
        Thread.sleep(2000);
        
       List<WebElement> options=sl.getOptions();
       
       int si=options.size();
       
       for (int i=0; i<si; i++) {
       WebElement option1=options.get(i);
       String text=option1.getText();
       System.out.println(text);
         
       }  
       
	}
       
	}
        
	


