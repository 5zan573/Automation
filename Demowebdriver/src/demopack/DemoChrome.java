package demopack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoChrome {

	public static void main(String[] args) {
	System.out.println("Hello World");

	System.setProperty("webdriver.chrome.driver","C:\\Users\\mohd.hussain\\Desktop\\Faizan\\KRN\\chromedriver-win64\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.google.com");
	
	
	}

}
