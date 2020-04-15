package FlipKart_Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Signin {

	public static void main(String[] args) throws InterruptedException {
		//lunch the browser
		System.setProperty("webdriver.chrome.driver","D:\\SeleniumDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//initialize the site
		driver.get("https://www.flipkart.com/");
		//maximize the webbrowser
		driver.manage().window().maximize();
		//take the courser point to the option
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[text()='New to Flipkart? Create an account']"))).perform();
		Thread.sleep(2000);
		//click on the option
		driver.findElement(By.xpath("//a[@class='oZoRPi']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']")).sendKeys("9776537829");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='CONTINUE']")).click();
		Thread.sleep(2000);
		driver.close();

	}

}
