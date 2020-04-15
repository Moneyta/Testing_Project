package FlipKart_Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Cart {

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
				//signin
				driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']")).sendKeys("9776537829");
				Thread.sleep(2000);
				//continue
				driver.findElement(By.xpath("//span[text()='CONTINUE']")).click();
				Thread.sleep(2000);
				//login password
				driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']")).sendKeys("Money@143");
				Thread.sleep(2000);
				//submit button
				driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
				Thread.sleep(5000);
				//move the courser to women catagory
				Actions act1=new Actions(driver);
				act1.moveToElement(driver.findElement(By.xpath("//span[@class='_1QZ6fC _3Lgyp8'][text()='Women']"))).perform();
				Thread.sleep(2000);
				//move the corser to saree
				Actions act2=new Actions(driver);
				act2.moveToElement(driver.findElement(By.xpath("//a[@title='Sarees']"))).perform();
				Thread.sleep(2000);
				//click on saree
				driver.findElement(By.xpath("//a[@title='Sarees']")).click();
				Thread.sleep(2000);
				//move the corser to cart option
				Actions act3=new Actions(driver);
				act3.moveToElement(driver.findElement(By.xpath("//span[text()='Cart']"))).perform();
				Thread.sleep(2000);
				//click on cart
				driver.findElement(By.xpath("//a[@class='_3ko_Ud']")).click();
				Thread.sleep(5000);
				//press the button for place order
				driver.findElement(By.xpath("//button[@class='_2AkmmA iwYpF9 _7UHT_c']")).click();
				Thread.sleep(2000);
				//click on address 
				driver.findElement(By.xpath("//button[@class='_2AkmmA _I6-pD _7UHT_c']")).click();
				Thread.sleep(2000);
				//close the window
				driver.close();


	}

}
