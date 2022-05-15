package justherbs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Harbal_POM {
	
	public void maximizeBrowser(WebDriver driver) {
		
		driver.manage().window().maximize();
	}
	public void url(WebDriver driver) {
		driver.get("https://www.justherbs.in/");
	}
	public void window(WebDriver driver) {
		driver.findElement(By.xpath("//*[@id=\"shopify-section-header\"]/div/header/div[2]/div[2]/div[1]/a")).click();
	}
	public void Login(WebDriver driver) {
		driver.findElement(By.xpath("/html/body/div[4]/div[5]/div[1]/div/header/div[2]/div[2]/div[2]/a[1]")).click();
	}
	public void Email(WebDriver driver,String email) {
		driver.findElement(By.xpath("/html/body/div[4]/div[5]/section/div/div/div[1]/form/input[3]")).sendKeys(email);
	}
	public void Password(WebDriver driver,String pwd) {
		driver.findElement(By.xpath("/html/body/div[4]/div[5]/section/div/div/div[1]/form/input[4]")).sendKeys(pwd);
	}
	public void loginup(WebDriver driver) {
		driver.findElement(By.xpath("/html/body/div[4]/div[5]/section/div/div/div[1]/form/div/input")).click();
	}


}
