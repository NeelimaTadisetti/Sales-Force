import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class SF_fgtpw {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		String exePath= ("C:\\\\Automation\\\\Webdrivers\\\\geckodriver.exe") ;
		System.setProperty("webdriver.gecko.driver",exePath);
		WebDriver driver = new FirefoxDriver();
		FirefoxProfile profile = new FirefoxProfile();
		profile.setAcceptUntrustedCertificates(true);
	
			
			
			driver.manage().deleteAllCookies();
			
			driver.get("https://awchelp.secure.force.com");
			driver.get("http://awchelp.force.com/apex/bmcservicedesk__sssitelogin?lang=en-ie");
			System.out.println("Salesforce web page launched");
			Thread.sleep(10000);
			//Click linktext
			driver.findElement(By.linkText("Forgot Your Password?")).click();
			
			//Find text on webpage
			driver.findElement(By.className("mb12"));
			
			//Enter random text and clear
			driver.findElement(By.id("un")).sendKeys("Test123");
			Thread.sleep(10000);
			driver.findElement(By.id("un")).clear();		
			
			//Click cancel button
			driver.findElement(By.cssSelector("[class*='secondary']")).click();
			
			
			
			
			driver.get("https://awchelp.my.salesforce.com/");
			Thread.sleep(1000);
			//Enter valid login details			
			driver.findElement(By.id("username")).sendKeys("neelima.rao@allianzworldwidecare.com");
			driver.findElement(By.name("pw")).sendKeys("Allianz321!");
			
			//Select checkbox
		    driver.findElement(By.id("rememberUn")).click();
			driver.findElement(By.id("rememberUn")).isSelected();
			System.out.println("checkbox is checked");	
			Thread.sleep(10000);
			
			//Uncheck checkbox
            boolean x=  driver.findElement(By.id("rememberUn")).isSelected();
            if (x== true)
       		driver.findElement(By.id("rememberUn")).click();
            System.out.println("Checkbox is now unchecked");
            
            //Login				
			driver.findElement(By.xpath("//input[@id='Login']")).click();
			Thread.sleep(5000);
			
			boolean img =driver.findElement(By.xpath("//img[@id='phHeaderLogoImage']")).isDisplayed();			
			if (img== true)
				 System.out.println("phHeaderLogoImage is present");	
			
			driver.findElement(By.xpath("//*[@id=\'01rG0000000dXH9_Tab\']")).click();
			Thread.sleep(5000);			
		
			//driver.findElement(By.linkText("View Tickets and Requests")).click();	
			driver.findElement(By.id("selfServicerf-tile-INCSRLST")).click();
		    System.out.println("got it");
			/*driver.findElement(By.id("incSrchTxt-inputEl")).sendKeys("00130560");
		    driver.switchTo().frame("iframe-rf-tile-INCSRLST");
		    System.out.println("frame switched");
			driver.findElement(By.cssSelector("input#incSrchTxt-inputEl")).sendKeys("00130560");
			
			driver.findElement(By.id("searchBtn-btnEl")).click();*/
			Thread.sleep(5000);
			
			/*driver.findElement(By.id("phSearchInput")).sendKeys("12345");
			
			//Select Logout from dropdown and logout of app
			driver.findElement(By.id("userNavButton")).click();
			driver.findElement(By.xpath("//a[@title='Logout']")).click();*/
			

		
			
	}

}
