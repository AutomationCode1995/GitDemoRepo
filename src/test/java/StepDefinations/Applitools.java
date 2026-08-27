package StepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.applitools.eyes.selenium.Eyes;

public class Applitools {
	public static void main(String[] args) {
		
	
	
//Initialize browser	
	
	WebDriver driver = new ChromeDriver();

	driver.get("https://your-site.com");
	
//	Initialize Eyes
	
	Eyes eyes = new Eyes();

	eyes.setApiKey("API_KEY");
	
	eyes.open(
	        driver,
	        "Filter Project",
	        "Validate TATA Filter");
	
//Apply filter	
	driver.findElement(By.id("tata"))
    .click();
	
	//capture entire browser page
	
	eyes.checkWindow("TATA Results");
	

}
}