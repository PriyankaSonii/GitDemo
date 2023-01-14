package OkJetHeader;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Cartapp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//implicit wait
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		//explicit wait
		WebDriverWait w= new WebDriverWait(driver,5);
		String[] itemNeeded = {"Strawberry", "Brocolli", "Beetroot","Onion" };
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(2000);
		
		addedItems(driver,itemNeeded);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[class='promoCode']")));
		driver.findElement(By.cssSelector("input[class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		//explicit wait
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		
		System.out.println( driver.findElement(By.cssSelector("span.promoInfo")).getText());		
	}
public static void addedItems(WebDriver driver,String[] itemNeeded)
{
	int j=0;
	List<WebElement> product = driver.findElements(By.cssSelector("h4.product-name"));
	for (int i = 0; i < product.size(); i++) {

		String[] name = product.get(i).getText().split("-");
		String formatedName = name[0].trim();

		// format it to get actual vegetable name
		// convert array into array list for easy search
		// check whether the name you extracted is present in array or not

		List<String> itemNeededList = Arrays.asList(itemNeeded);
		

		if (itemNeededList.contains(formatedName)) {
			j++;
			// click on add to cart
			driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			//Thread.sleep(5000);
			if (j == itemNeeded.length) {
				break;
			}

		}

	}
	




}
}
