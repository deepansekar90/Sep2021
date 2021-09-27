package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.leafground.com/pages/Alert.html");

		// Simple Alert
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();

		Alert alert = driver.switchTo().alert();

		String alerttext = alert.getText();

		System.out.println(alerttext);

		alert.accept();

		// Confirmation Alert

		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();

		alert.accept();

		String text = driver.findElement(By.id("result")).getText();

		System.out.println(text);

		// Prompt Box

		driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();

		alert.sendKeys("Test Leaf");

		alert.accept();

		String resulttext = driver.findElement(By.id("result1")).getText();

		System.out.println(resulttext);

	}

}