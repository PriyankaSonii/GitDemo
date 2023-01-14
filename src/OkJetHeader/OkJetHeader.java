package OkJetHeader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class OkJetHeader {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//departure city
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(1000);
		
		//Arrvial city
		
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
		{
			System.out.println("Its disabled");
			Assert.assertTrue(true);
		
		}
		else
		{
			System.out.println("Its id enable");
			Assert.assertTrue(false);
			
		}
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		
		//drop down select adults
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		
		for(int i=1 ;i<5 ;i++)
		{
		driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
		
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		//Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		//System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		//driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).click();
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_btn_FindFlights']")).click();
		
		
		//Departure date current date
		
		
		
		

	}

}
