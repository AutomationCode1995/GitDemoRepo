package StepDefinations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import PageFactory.FilterPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AshotStepdefination {

	
	WebDriver driver;
	FilterPage obj;
	
	
	
		@Given("the user is on the homepage")
		public void the_user_is_on_the_homepage() {
			driver.get("https://yourwebsite.com");
		}

		@When("the user applies the {string} filter under the Cars category")
		public void the_user_applies_the_filter_under_the_cars_category(String string) {
		    obj.clickTataFilter();

		}
		
		@Then("only TATA car results should be displayed")
		public void only_tata_car_results_should_be_displayed() {
			
			
	             //All results after filter
			List<WebElement> images =
					driver.findElements(By.className("vehicle-image"));

			    //Loop through every Images
			    for(WebElement image : images) {

			        if(image.isDisplayed()) {
			     //Verify image is fully loaded
			        	
			            Boolean loaded = (Boolean)((JavascriptExecutor)driver)
			                    .executeScript(
			                            "return arguments[0].complete && arguments[0].naturalWidth > 0",
			                            image);

			            Assert.assertTrue(loaded);
			        	
	             //read only TATA
			            String brand =
			            		image.getAttribute("Vehicle-Brand");

			            Assert.assertEquals(brand, "TATA");
			        }
			    }
			}
		}







