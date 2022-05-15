package justherbs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Harbal_MainClass {
	public static void main(String[] args) throws Exception {
		 WebDriver driver;
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Documents\\Automation\\Browser Extention\\chromedriver.exe");
		 ChromeOptions options=new ChromeOptions();
		 options.addArguments("disable-notifications");
		    driver=new ChromeDriver(options);
		   Thread.sleep(2000);
		   driver.manage().window().maximize();
		
		 Thread.sleep(2000);
		 Harbal_POM h=new  Harbal_POM();
		 h.maximizeBrowser(driver);
		 h.url(driver);
		 h.window(driver);
		 h.Login(driver);
		 h.Email(driver, "bhagyashri1@gmail.com");
		 h.Password(driver, "Bhagyashri@123");
		 h.loginup(driver);

    }
}
