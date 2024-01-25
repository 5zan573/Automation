package demopack;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAllCheckboxes {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\mohd.hussain\\Desktop\\Faizan\\KRN\\chromedriver-win64\\chromedriver.exe\\");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.krninformatix.com/learn.html");
        
        List<WebElement> allcheckboxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
        
        int si=allcheckboxes.size();
        
        for (int i=0; i<si; i++) {
        WebElement check=allcheckboxes.get(i);
        check.click();
        	
        Thread.sleep(1000);
        
        }

	}

}
