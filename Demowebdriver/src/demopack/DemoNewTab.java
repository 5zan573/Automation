package demopack;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoNewTab {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohd.hussain\\Desktop\\Faizan\\KRN\\chromedriver-win64\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.air.irctc.co.in");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("/html/body/app-root/app-index/div[4]/div/ul/li[6]/a/div")).click();
	
		Set<String> allwindows=driver.getWindowHandles();
		
		Iterator <String> it=allwindows.iterator();
		
		String irctc=it.next();
		String tourpackages=it.next();
		
		System.out.println(irctc);
		System.out.println(tourpackages);
		
		driver.switchTo().window(tourpackages);
		
		driver.findElement(By.xpath("//span[text()='Air Package']/..//span[@class='checkmark']")).click();
		
		driver.close();
		
		driver.switchTo().window(irctc);
		
		driver.findElement(By.id("stationFrom")).sendKeys("Bengaluru");
	
		
	}
}
