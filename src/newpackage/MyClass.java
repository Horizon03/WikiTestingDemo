package newpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//comment the above line and uncomment below line to use Chrome
import org.openqa.selenium.chrome.ChromeDriver;

public class MyClass {
	
	 public static void main(String[] args) {
	       
			System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
	    	
	       
	        driver.get("https://en.wikipedia.org");

	       System.out.println(driver.getTitle());
	       
	       System.out.println(driver.getCurrentUrl());
	       driver.findElement(By.id("pt-login")).click();
	       driver.findElement(By.id("wpName1")).sendKeys("This is my first code.");
	       driver.findElement(By.id("wpPassword1")).sendKeys("HelloWorld!");
	       driver.findElement(By.id("wpLoginAttempt")).click();
	        
	       
	    }


}
