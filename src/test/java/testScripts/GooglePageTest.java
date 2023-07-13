package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GooglePageTest {

	public static void main(String[] args) throws InterruptedException {
		//4.8
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");
//		WebDriver driver = new ChromeDriver(options);
		
		//4.10
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.google.com/");
		driver.navigate().to("https://www.google.com/");
		
//		WebElement schBox = driver.findElement(By.name("q"));
//		WebElement schBox = driver.findElement(By.id("APjFqb"));
		
//		WebElement schBox = driver.findElement(By.className("gLFyf"));
		WebElement schBox = driver.findElement(By.tagName("textarea"));
		schBox.sendKeys("Java Tutorial");
		Thread.sleep(3000);
		List<WebElement> items = driver.findElements(By.xpath("(//ul[@jsname='bw4e9b'])[1]//li//descendant::div[@class='wM6W7d']"));
		System.out.println("No . of items: " + items.size());
		for( int i=0 ; i<items.size();i++) {
			System.out.println(items.get(i).getText());
			if(items.get(i).getText().equalsIgnoreCase("java tutorial"))
				items.get(i).click();
			break;
		}
			
		}
//Search result1:(//ul[@jsname='bw4e9b'])[1]//li//descendant::div[@class='wM6W7d']
//		schBox.sendKeys(Keys.ENTER);
//		schBox.submit();
//		System.out.println("Page title : " + driver.getTitle());
//		System.out.println("Current url  : "+driver.getCurrentUrl());
//		driver.navigate().back();
//		//wait commands
//		System.out.println("Page title : " + driver.getTitle());
//		driver.navigate().forward();
////		driver.getPageSource();
		
		
		
		
	}

}
