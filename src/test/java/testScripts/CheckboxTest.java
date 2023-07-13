package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxTest {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.seleniumeasy.com/table-sort-search-demo.html");
		
		WebElement optChk = driver.findElement(By.xpath("//input[@class='cb1-element'][1]"));
		if(!optChk.isSelected()) {
			optChk.click();
		}
			
		}

}
// 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
