package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TextFields {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://leaftaps.com/opentaps/control/main");

		String title = driver.getTitle();
		System.out.println("Title is " + title);

		WebElement username = driver.findElement(By.id("username"));

		username.sendKeys("demosalesmanager");

		WebElement password = driver.findElement(By.id("password"));

		password.sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Create Lead")).click();
		

		WebElement companyname = driver.findElement(By.id("createLeadForm_companyName"));
		//companyname.clear();
		companyname.sendKeys("ISC Solutions");
		
		WebElement firstname = driver.findElement(By.id("createLeadForm_firstName"));
		//firstname.clear();
		firstname.sendKeys("Deepan");
		
		WebElement lastname = driver.findElement(By.id("createLeadForm_lastName"));
		//lastname.clear();
		lastname.sendKeys("Sekar");
		
		driver.findElement(By.className("smallSubmit")).click();

	}

}
