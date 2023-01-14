package OkJetHeader;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.By;

public class FireFox {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Priyanka Soni\\Downloads\\geckodriver-v0.32.0-win32\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		// TODO Auto-generated method stub

	}

}
