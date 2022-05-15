package justherbs;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;

public class Harbal_login {
	WebDriver driver;
  @BeforeTest
  public void beforeTest() throws Exception {
	  
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Documents\\Automation\\Browser Extention\\chromedriver.exe");
		 ChromeOptions options=new ChromeOptions();
		 options.addArguments("disable-notifications");
		    driver=new ChromeDriver(options);
		   Thread.sleep(2000);
		   driver.manage().window().maximize();
  }
  @Test
  public void Login() throws Exception {
	  //url
	  driver.get("https://www.justherbs.in/");
	
	  
	  //Login
	  driver.findElement(By.xpath("//*[@id=\"shopify-section-header\"]/div/header/div[2]/div[2]/div[1]/a")).click();
	  Thread.sleep(2000);
	  
	 driver.findElement(By.xpath("/html/body/div[4]/div[5]/div[1]/div/header/div[2]/div[2]/div[2]/a[1]")).click();
	 driver.findElement(By.xpath("//*[@id=\"customer_email\"]")).sendKeys("bhagyashri1@gmail.com");
	 driver.findElement(By.xpath("//*[@id=\"customer_password\"]")).sendKeys("Bhagyashri@123");
	 driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div/input")).click();
	Thread.sleep(10000);
	 
	 
	 //Logout 
	 driver.findElement(By.xpath("//*[@id=\"shopify-section-header\"]/div/header/div[2]/div[2]/div[1]/a/svg")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"customer_logout_link\"]")).click();
     
  }

  @AfterTest
  public void afterTest() {
  }

}
