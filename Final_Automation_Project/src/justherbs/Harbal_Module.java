package justherbs;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Harbal_Module {
	WebDriver driver;
	 @BeforeTest
	  public void beforeTest() throws Exception 
	 {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Documents\\Automation\\Browser Extention\\chromedriver.exe");
	 ChromeOptions options=new ChromeOptions();
	 options.addArguments("disable-notifications");
	    driver=new ChromeDriver(options);
	   Thread.sleep(2000);
	   driver.manage().window().maximize();
	  
	   
	   //url
		  driver.get("https://www.justherbs.in/");
	  }
	 

  @Test (priority=1)
  
	 public void Skin() throws Exception
	 
	 {
	
		 System.out.println("**Skin***");  
		     
		     driver.findElement(By.xpath("//*[@id=\"search--form\"]")).sendKeys("night cream");
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("/html/body/div[4]/div[5]/div[1]/div/header/div[2]/div[2]/div[1]/form/button")).click();
			 
            driver.findElement(By.xpath("/html/body/div[4]/div[5]/section/div/div/div/div/div/div/div[3]/div/ul/li[1]/a/div/span/span[1]")).click();
            Thread.sleep(1000);
		     driver.findElement(By.xpath("//*[@id=\"add\"]")).click();
		    
			   Thread.sleep(2000);
		   driver.findElement(By.xpath("/html/body/div[4]/div[2]")).click();
		   Thread.sleep(2000);
		  
	  }
     @Test(priority=2)
        public void BathAndBody() throws Exception
 
	    {
        System.out.println("**BathAndBody***");  
         driver.findElement(By.xpath("//*[@id=\"search--form\"]")).sendKeys("Body scrub");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("/html/body/div[4]/div[5]/div[1]/div/header/div[2]/div[2]/div[1]/form/button")).click();
	
		 driver.findElement(By.xpath("//*[@id=\"snize-product-6673459871821\"]/a/div/span/span[1]")).click();
	     Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@id=\"add\"]/span[1]/span")).click();
		 Thread.sleep(2000);
		
        }
     @Test(priority=3)
     //This Module was priviously working but as a live application it is contineously updating so now this module not working. 
	 public void NaturalMekup() throws Exception
	 
	 {
	     System.out.println("**NaturalMekup***");  
	    driver.findElement(By.xpath("//*[@id=\"search--form\"]")).sendKeys("Lipstick");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/div[4]/div[5]/div[1]/div/header/div[2]/div[2]/div[1]/form/button")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/div[4]/div[5]/section/div/div/div/div/div/div/div[3]/div/ul/li[2]/a/div/span/span[1]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@id=\"add\"]/span[1]/span")).click();
		 Thread.sleep(2000);
		
	 }
     @Test (priority=4)
     
  	 public void screenshot() throws Exception
	 
   	 {
  	  
   	     driver.findElement(By.xpath("//*[@id=\"shopify-section-header\"]/div/header/div[3]/div[1]/nav/ul/li[2]/a")).click();	
   		 Thread.sleep(2000);
  		 
   		 //How to screenshot
   		 TakesScreenshot ts=(TakesScreenshot)driver;
   		 File src=ts.getScreenshotAs(OutputType.FILE);
  		 FileHandler.copy(src, new File(".\\Hair.png"));
  		 Thread.sleep(2000);
 	 }
     @Test(priority=5)
	 public void TryAndBuy() throws Exception
	 
	 {
	     System.out.println("**TryAndBuy***");  
	     driver.findElement(By.xpath("//*[@id=\"search--form\"]")).sendKeys("Ayurvedic Glow Boosting Trial Kit");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("/html/body/div[4]/div[5]/div[1]/div/header/div[2]/div[2]/div[1]/form/button")).click();
		
		 driver.findElement(By.xpath("//*[@id=\"snize-product-4451725181005\"]/a/div/span/span[1]")).click();
         //Add to card
		 driver.findElement(By.xpath("//*[@id=\"add\"]/span[1]")).click();
		 Thread.sleep(2000);
		 
		//checkout This is Live side thats why the xpath working sometime or not be 
		 driver.findElement(By.xpath("/html/body/div[4]/div[4]/div/form/div[2]/div/div[3]/div[4]")).click();
		 Thread.sleep(1000);
		//Email  This is Live side thats why the xpath working sometime or not be
		 driver.findElement(By.xpath("/html/body/div[1]/div/div/main/div[1]/form/div[1]/div[2]/div[2]/div/div[1]/div[2]/div/input")).sendKeys("bhagyashrimadankar@gmail.com");
		 driver.findElement(By.xpath("//*[@id=\"checkout_shipping_address_first_name\"]")).sendKeys("Bhagyashri");
		 driver.findElement(By.xpath("//*[@id=\"checkout_shipping_address_last_name\"]")).sendKeys("Madankar");
		 driver.findElement(By.xpath("//*[@id=\"checkout_shipping_address_address1\"]")).sendKeys("zingbai takli Nagpur");
		 driver.findElement(By.xpath("//*[@id=\"checkout_shipping_address_address2\"]")).sendKeys("Plot no 25");
		 driver.findElement(By.xpath("//*[@id=\"checkout_shipping_address_city\"]")).sendKeys("Nagpur");
		 driver.findElement(By.xpath("//*[@id=\"checkout_shipping_address_province\"]")).sendKeys("Maharashtra");	
		 driver.findElement(By.xpath("//*[@id=\"checkout_shipping_address_zip\"]")).sendKeys("442315");
		 driver.findElement(By.xpath("//*[@id=\"checkout_shipping_address_phone\"]")).sendKeys("9856451235");
		 driver.findElement(By.id("//*[@id=\"continue_button\"]/span\r\n")).click();
		 }
  


   
   }
