package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Step 1: Setup Driver
		WebDriverManager.chromedriver().setup();
		
		//Step 2:Launch browser
		
		ChromeDriver driver=new ChromeDriver();
		
		//Step 3: Maximize the browser
		
		driver.manage().window().maximize();
		
		// Step 4 : launch the url
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//Step 5: Get title
		
		String title=driver.getTitle();
		System.out.println("Title is "+ title);
	
		//Step 6: Close the browser
		
		driver.close();
	}

}
