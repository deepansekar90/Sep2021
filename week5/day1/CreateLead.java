package week5.day1;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ISC");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Deepan");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sekar");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9840073724");
		driver.findElement(By.name("submitButton")).click();

	}

}
