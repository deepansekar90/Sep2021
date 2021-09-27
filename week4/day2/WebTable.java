package week4.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.leafground.com/pages/table.html");
		
		WebElement webtable=driver.findElement(By.id("table_id"));
		
		List<WebElement> tablerows=webtable.findElements(By.tagName("tr"));
		System.out.println("Number of Rows = " + tablerows.size());
		
		WebElement tablefirstrow=tablerows.get(0);
		
		List<WebElement> tablecolumn=tablefirstrow.findElements(By.tagName("th"));
		System.out.println("Number of Columns = " + tablecolumn.size());
		


	}

}
