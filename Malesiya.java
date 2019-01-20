import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Malesiya {
	WebDriver driver;
	@Test
	public void Banks_names() {		
			System.setProperty("webdriver.chrome.driver","D:\\SeleniumChrome\\chromedriver_win32\\chromedriver.exe"); //setting chrome_driver path
			 driver = new ChromeDriver(); //launching chrome
			driver.get("https://www.theswiftcodes.com/malaysia/"); 
			driver.manage().window().maximize();	
			List<WebElement> bankname= driver.findElements(By.xpath("//table[@class='swift']//td[2]"));//getting list of all names of all banks	
			System.out.println("The total list of  banks are :"+bankname.size());
			for(WebElement ls1: bankname)
				{
				System.out.println(ls1.getText()); // getting text for each bank 
				}
			}
			@Test
			public void Swift_code() {
			//****************** Swift Code **************************************
			List<WebElement> swift_code= driver.findElements(By.xpath("//table[@class='swift']//td[5]")); //getting list of all swift code
			System.out.println("The total list of  swift_code are :"+swift_code.size());
			for(WebElement ls2: swift_code)
			{
			System.out.println(ls2.getText()); // getting text for each bank 
			}
			
		}


}
