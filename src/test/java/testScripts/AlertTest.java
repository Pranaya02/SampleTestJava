package testScripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTest {
	
	public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.seleniumeasy.com/javascript-alert-box-demo.html");
	driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
	Alert alert= driver.switchTo().alert();
	System.out.println(alert.getText());
	alert.accept();
	
	driver.findElement(By.xpath("(//button[@class='btn btn-default btn-lgt'][1]")).click();
	Alert confirm = driver.switchTo().alert();
	System.out.println(confirm.getText());
	confirm.accept();
	confirm.dismiss();
	
	
	
	
	
	

}
}