
package Demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo{
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Testing Software\\Vishnu Sir_Selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("https://www.google.com");
		System.out.println("open");
		driver.close();
		
	}
	
	
	
}

