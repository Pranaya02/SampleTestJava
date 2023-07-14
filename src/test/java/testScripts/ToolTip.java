package testScripts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTip {
	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions actions = new Actions(driver);

		
//Take img screenshot
				driver.get("https://demo.opencart.com/");
				WebElement img = driver.findElement(By.xpath("//*[@class='img-fluid']"));
				FileUtils.copyFile((File) img, new File("C:\\Scrrenshot\\Fullscreen.png"));
		        actions.scrollToElement(img).perform();
//Take screenshot	
		driver.get("https://jqueryui.com/tooltip/");
		TakesScreenshot screen = (TakesScreenshot)driver;
		File scr = screen.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr, new File("C:\\Scrrenshot\\Fullscreen.png"));
		

		
		driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
		WebElement age =driver.findElement(By.id("age"));
		actions.moveToElement(age).perform();
		String str= driver.findElement(By.cssSelector(".ui-tooltip-content")).getText();
		
		System.out.println(str);
		
		
	}
}
