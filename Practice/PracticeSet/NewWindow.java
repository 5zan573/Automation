package PracticeSet;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindow {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohd.hussain\\Desktop\\Faizan\\KRN\\chromedriver-win64\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://hotels.irctc.co.in/");
		
		driver.findElement(By.xpath("//a[@title=\"Tour Package\"]")).click();
		
		Set<String> allwindows=driver.getWindowHandles();
		
		Iterator<String> itr=allwindows.iterator();
		
		String parent=itr.next();
		String child=itr.next();
		
		driver.findElement(By.xpath("//span[text()='Air Package']/..//label[@class='check-box']")).click();
		
		
		
		
		
		

	}

}
