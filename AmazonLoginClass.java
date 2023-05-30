import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

public class AmazonLoginClass {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\Selenuim\\Driver\\chromedriver.exe");
 WebDriver driver = new ChromeDriver();
 JavascriptExecutor js = (JavascriptExecutor) driver;
 driver.get("https://www.amazon.com");
 try {
	 Thread.sleep(5000); // Wait for 5 seconds
	  } catch (InterruptedException e) {
	 e.printStackTrace();
	  }
 driver.manage().window().maximize();
 /*//Click on Sign in
 driver.findElement(By.linkText("Sign in")).click();
 
 //Enter email address
 driver.findElement(By.name("email")).sendKeys("vinomano1997@gmail.com");
 driver.findElement(By.xpath("//input[@id=\"continue\"]")).click();
 driver.findElement(By.name("password")).sendKeys("Ramvino@1610");
 driver.findElement(By.xpath("//input[@id=\"signInSubmit\"]")).click();
 driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("iphone 13 pro max case");
 driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")).click();
 driver.findElement(By.xpath("//div[@data-index=\"3\"]")).click();*/
 driver.findElement(By.xpath("//a[@id=\"nav-hamburger-menu\"]")).click();
 driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
 driver.findElement(By.xpath("//div[text()=\"Electronics\"]")).click();
 try {
	 Thread.sleep(5000); // Wait for 5 seconds
	  } catch (InterruptedException e) {
	 e.printStackTrace();
	  }
 driver.findElement(By.xpath("//a[text()=\"Camera & Photo\"]")).click();
 driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
 driver.findElement(By.xpath("//img[@data-image-index=\"1\"]")).click();
 try {
	 Thread.sleep(5000); // Wait for 5 seconds
	  } catch (InterruptedException e) {
	 e.printStackTrace();
	  }
 driver.findElement(By.id("bylineInfo")).click();
 //driver.findElement(By.className("a-section a-spacing-none a-spacing-top-small s-title-instructions-style")).click();
 //driver.findElement(By.className("a-section aok-relative s-image-square-aspect")).click();
 driver.findElement(By.className("s-image")).click();
 driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
 driver.findElement(By.xpath("//img[@data-image-index=\"1\"]")).click();
 driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
 driver.findElement(By.className("a-size-base-plus a-color-base a-text-normal")).click();
 driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
 driver.findElement(By.id("acrCustomerReviewText")).click();
 driver.findElement(By.xpath("//a[text()=\"Fujifilm GFX 100S Body - Black\"]")).click();
 driver.findElement(By.className("a-expander-prompt")).click();

 
}
}
