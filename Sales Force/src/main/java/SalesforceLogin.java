import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SalesforceLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		String exePath = ("C:\\Automation\\Webdrivers\\geckodriver.exe");
		System.setProperty ("webdriver.gecko.driver",exePath);
		WebDriver driver = new FirefoxDriver();

		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		/*driver.get("https://awchelp.secure.force.com");*/
		driver.get("http://awchelp.force.com/apex/bmcservicedesk__sssitelogin?lang=en-ie");
		System.out.println("Salesforce web page launched");
		
		driver.findElement(By.xpath("//input[contains(@title,'account')]")).sendKeys("neelima.rao@allianzworldwidecare.com");
		driver.findElement(By.xpath("//input[contains(@title,'password')]")).sendKeys("Allianz321!");
		driver.findElement(By.xpath("//input[@value='Login']")).click();

		System.out.println("Salesforce login successfull");	
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("selfServicerf-tile-INCSRLST")).click();
		System.out.println("clicked on selfservice successfull");
		
        driver.findElement(By.xpath("//*[@id='moreOptions']")).click();
        System.out.println("Quicklinks found");           
        driver.findElement(By.xpath("//div[@id='otheroptionsMenu']//span[text()='Log Out']")).click();


	}

}

