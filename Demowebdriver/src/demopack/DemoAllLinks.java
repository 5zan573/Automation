package demopack;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAllLinks {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\mohd.hussain\\Desktop\\Faizan\\KRN\\chromedriver-win64\\chromedriver.exe\\");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.krninformatix.com");
        
        List<WebElement> allLinks=driver.findElements(By.xpath("//a"));
        
        int si=allLinks.size();
        
        for (int i=0; i<si; i++) {
        	WebElement link=allLinks.get(i);
        	String te=link.getText();
        	System.out.println(te);
        	
        	
        	
        }
        
	}

}
