package demopack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoChecckpointsElement {

	public static void main(String[] args) throws InterruptedException {
	

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohd.hussain\\Desktop\\Faizan\\KRN\\chromedriver-win64\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.krninformatix.com/sample.html");
		
	    boolean chkboxstatus=driver.findElement(By.xpath("//*[@id=\"rep\"]")).isSelected();
	 System.out.println(chkboxstatus);
	    
	 boolean chkboxstatus1=driver.findElement(By.xpath("//*[@id=\"rep\"]")).isSelected();
	 System.out.println(chkboxstatus1);
	  
	boolean chkboxstatus2=driver.findElement(By.xpath("//*[@id=\"rep\"]")).isSelected();
	  System.out.print(chkboxstatus2);
	  
	  if (!chkboxstatus2) {
	driver.findElement(By.xpath("//*[@id=\"rep\"]")).click();
	 }

	}
}

	
	
	


