package DAY1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class REVISIONSELENIUM {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ghimi\\Desktop\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		
		//sendkeys
		driver.findElement(By.cssSelector("input[name=\"search_query\"]")).sendKeys("blouse");
		//click
		driver.findElement(By.name("submit_search")).click();
//		//get attribute
//		String search1 = driver.findElement(By.xpath("//input[@id=\"search_query_top\"]")).getAttribute("id");
//		System.out.println(search1);
//		
//		//get tag name
//		String search2 = driver.findElement(By.cssSelector("a[title=\"Contact Us\"]")).getText();
//		System.out.println(search2);
//		
		//get text
		String search3 = driver.findElement(By.tagName("b")).getText();
		System.out.println(search3);

		
	
		// get size
//		System.out.println(driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[4]")).getSize());
//		
//		//get location
//		System.out.println(driver.findElement(By.xpath("(//input[@type=\"radio\"])[5]")).getLocation());
//		
//		//get css value
//		String value1 = driver.findElement(By.cssSelector("input[value=\"option-1\"]")).getCssValue("color");
//		System.out.println(value1);
//		

	}

}
