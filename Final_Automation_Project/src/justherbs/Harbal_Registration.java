package justherbs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Harbal_Registration {


	  public static void main(String[] args) throws Exception {
		  WebDriver driver;
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Documents\\Automation\\Browser Extention\\chromedriver.exe");
		 ChromeOptions options=new ChromeOptions();
		 options.addArguments("disable-notifications");
		    driver=new ChromeDriver(options);
		   Thread.sleep(2000);
		   driver.manage().window().maximize();
	
          //url
		  driver.get("https://www.justherbs.in/");
		
		  
		  //Registration 
		  driver.findElement(By.xpath("//*[@id=\"shopify-section-header\"]/div/header/div[2]/div[2]/div[1]/a")).click();
		  Thread.sleep(2000);
		  
           //SignUP
		  driver.findElement(By.xpath("//*[@id=\"customer_register_link\"]")).click();
		  driver.findElement(By.xpath("//*[@id=\"first_name\"]")).sendKeys("Bhagyashri");
		  
		  driver.findElement(By.xpath("//*[@id=\"last_name\"]")).sendKeys("Madankar");
		  
		  driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("bhagyashri1@gmail.com");
		  driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Bhagyashri@123");
		  driver.findElement(By.xpath("//*[@id=\"birthday\"]")).sendKeys("01/07/1996");
		  driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("8830834112");
		  driver.findElement(By.xpath("//*[@id=\"create_customer\"]/div[7]")).click();
		  driver.findElement(By.xpath("//*[@id=\"create_customer\"]/div[8]/input")).click();
		  
}
	 

}
