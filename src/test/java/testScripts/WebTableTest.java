package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class WebTableTest {

	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.seleniumeasy.com/table-sort-search-demo.html");
	 String  salary = driver.findElement(By.xpath("//td[contains(text(), 'B. Wagner')]//following-sibling::td[5]")).getText();
		System.out.println("Salary ... : "+salary);
		driver.findElement(By.xpath("//td[contains(text(), 'Junior Technical Author')]//following-sibling::td[1]"));
		
		String position = driver.findElement(with(By.tagName("td"))
				
				.toRightOf(By.xpath("//td[contains(text(), 'B. Wagner')]")))
						.getText();
						System.out.println("Position ... " +position);
						
		//String Attributevalue =	driver.findElement(By.xpath("//td[contains(text(), 'B. Wagner')]")))
	}
}
