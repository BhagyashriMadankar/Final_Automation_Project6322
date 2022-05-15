package justherbs;

 import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;

public class Harbal_DDT 
{
  WebDriver driver;
  @BeforeTest
   public void beforeTest() throws Exception 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Documents\\Automation\\Browser Extention\\chromedriver.exe");
	  ChromeOptions options=new ChromeOptions();
		options.addArguments("disable-notifications");
	    driver=new ChromeDriver(options);

     Thread.sleep(2000);
     driver.manage().window().maximize();
		
  }
  
	@Test(dataProvider = "dp1")
  public void f(String  username, String password) throws Exception
	{ 
	     Harbal_POM h= new Harbal_POM();
	 
		 h.maximizeBrowser(driver);
		 h.url(driver);
		 h.window(driver);
		 h.Login(driver);
		 h.Email(driver, "bhagyashri1@gmail.com");
		 h.Password(driver, "Bhagyashri@123");
		 h.loginup(driver);

		
	}
	

  @DataProvider
  public Object[][] dp1()
  {
      return new Object[][] 
  		{
     
      new Object[] { "Demo", "Demo1" },
      new Object[] { "bhagyashri1@gmail.com", "Bhagyashri@" },
    //  new Object[] { "Demo@gmail.com", "Demo@12" },
      
    };
    
  }
  
  @AfterTest
  public void afterTest()
 {
 	driver.close();
 }
}