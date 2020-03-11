package sample.Loans;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;


public class App 
{
	@Test
   public void login()
    {
        System.out.println( "Hello World!" );
       System.setProperty("webdriver.chrome.driver", "D:\\Testing Software\\Vishnu Sir_Selenium\\chromedriver.exe");
       ChromeDriver driver=new ChromeDriver();
  	 driver.manage().window().maximize();
       driver.get("https://www.google.com");
       System.out.println("Google Browser open Successfully");
    }
}