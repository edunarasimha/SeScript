package Maven1.maventest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.setProperty("webdriver.chrome.driver", "\\home\\edureka\\chromedriver");
    	ChromeOptions chromeOptions = new ChromeOptions();
    	chromeOptions.addArguments("--headless");
    	WebDriver driver = new ChromeDriver(chromeOptions);
    	
        System.out.println( "Hello World!" );
        
        driver.get("http://localhost:8081/");
        
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.id("About Us")).click();
        
        if (driver.findElement(By.id("PID-ab2-pg")).isDisplayed())
        {
        	System.out.println("Validation success");
        }
        else
        	System.out.println("Failed!!");
        driver.quit();      
        
        
    }
}
