import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Amzon1 {
		@Test
		public void Amazon_product_images(){
		System.setProperty("webdriver.chrome.driver","D:\\SeleniumChrome\\chromedriver_win32\\chromedriver.exe"); //setting chrome_driver path
		WebDriver driver = new ChromeDriver(); //launching chrome
		driver.get("https://www.amazon.in/"); 
		driver.manage().window().maximize();	
		List<WebElement> ls= driver.findElements(By.xpath("//img[@class='product-image']/parent::a"));//getting all the list of products images with its parent anchor tag for reading href of product image		
		System.out.println("The total list of  are :"+ls.size());
		for(WebElement ls1: ls){
			System.out.println(ls1.getAttribute("href")); // getting href attribute element for each product image 
		}

	}

}
