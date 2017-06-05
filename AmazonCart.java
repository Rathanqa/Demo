package Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AmazonCart {
		
	@Test
	public void selectDDvalues()
	{

        System.setProperty("webdriver.chrome.driver", "C://Softwares Jva//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("macbook");
		
		
		driver.findElement(By.xpath("//*[@value='Go']")).click();
		
		WebElement sortby_dropdown=driver.findElement(By.id("sort"));
		Select sortby_dd =new Select(sortby_dropdown);
		sortby_dd.selectByIndex(3);
		//driver.findElement(By.xpath("//*[@id='result_5']")).click();
		
		driver.navigate().to("https://www.amazon.com/Apple-MacBook-15-4-Inch-Laptop-Touch/dp/B06XPXD7JQ/ref=sr_1_6?s=pc&ie=UTF8&qid=1496625313&sr=1-6&keywords=macbook");
		driver.findElement(By.id("add-to-cart-button")).click();
		driver.findElement(By.xpath("//*[@id='hlb-ptc-btn-native']")).click();
		
		
		
		
		
	}
	
	
}
