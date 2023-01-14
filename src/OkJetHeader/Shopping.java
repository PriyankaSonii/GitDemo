package OkJetHeader;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shopping {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String[] itemsNeeded= {"Tomato","Strawberry","Onion"};
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(2000);
		addItems(driver,itemsNeeded);
			
			
		}

	
	
	public static void addItems(WebDriver driver,String[] itemsNeeded)
	{
		int j=0;
		List<WebElement> product= driver.findElements(By.cssSelector("h4.product-name"));
		for(int i=0;i<product.size();i++)
		{
			String[] itemName= product.get(i).getText().split("-");
			String afterSplit = itemName[0].trim();
			
			List veggiesAdded = Arrays.asList(itemsNeeded);
			
			if(veggiesAdded.contains(afterSplit))
			{
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(j==itemsNeeded.length)
				{
					break;
				}
			}
		
		
	}
	}

}
