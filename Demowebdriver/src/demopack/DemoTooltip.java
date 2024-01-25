package demopack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTooltip {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\mohd.hussain\\Desktop\\Faizan\\KRN\\chromedriver-win64\\chromedriver.exe\\");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://gsmarena.com");
        
        driver.findElement(By.xpath("//a[text()='Samsung']")).click();
        
        String tooltip=driver.findElement(By.xpath("//img[contains(@src,'samsung-galaxy-a25')]")).getAttribute("title");
        System.out.println(tooltip);
	}

}
