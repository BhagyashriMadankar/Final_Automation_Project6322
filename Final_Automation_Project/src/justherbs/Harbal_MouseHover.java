package justherbs;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Harbal_MouseHover 
{ 
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
	  }
	 
	  @Test
	  public void Module() throws Exception 
	  {
		  //url
		  driver.get("https://www.justherbs.in/");
	  
	
		 
		 //step 1 Create Object of Action Class
		 Actions a=new Actions(driver); 
		 
		 //Step 2 Create Object of List with webElement
		 List<WebElement> ls=driver.findElements(By.xpath("//*[@id=\"shopify-section-header\"]/div/header/div[3]/div[1]/nav/ul/li"));
		 
		 //Step 3 Store size of lists
		 int listSize=ls.size();
		 System.out.println("No.of Modules:"+listSize);
		 
		 //step 4: for loop
		 for(int i=1;i<=listSize;i++)
		 {
			//Wait
	    	 Thread.sleep(2000);
	    	 
	    	//Display Module Name
	    	 System.out.println(driver.findElement(By.xpath("//*[@id=\"shopify-section-header\"]/div/header/div[3]/div[1]/nav/ul/li["+i+"]")).getText());
	    	 
	    	//Perform Mouse Hover
	    	 a.moveToElement(driver.findElement(By.xpath("//*[@id=\"shopify-section-header\"]/div/header/div[3]/div[1]/nav/ul/li["+i+"]"))).click().perform();
		 } 
	    }
	
	 	  
	  
	 
	
	
	  @AfterTest
	  public void afterTest()
	  {
		  //driver.close();
	  }

}
