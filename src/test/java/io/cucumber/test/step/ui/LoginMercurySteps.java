package io.cucumber.test.step.ui;

import com.pages.LoginPage;
import com.test.utils.AppConfigProperties;
import com.test.utils.BrowserDriver;
import com.test.utils.TestData;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class LoginMercurySteps {
	
	@Given("I launch Mercury Flight login Application")
	public void launchApp() {
		BrowserDriver.getDriver().get(AppConfigProperties.getApplicationProperties().getProperty("app.URL"));
		
		System.out.println("launch app");
	}
	@And("Login to app using id as (.*?) and password as (.*?)")
	public void loginMerc(String userId, String password) 
	{
		//userId=AppConfigProperties.getApplicationProperties().getProperty("mercury.user.id");
		//password=AppConfigProperties.getApplicationProperties().getProperty("mercury.user.password");
		
		
		//BrowserDriver.getDriver().findElement(By.xpath("//input[@name='userName']")).sendKeys(userId);
		LoginPage loginPage=new LoginPage(BrowserDriver.getDriver());
		loginPage.getUserNameEditBox().sendKeys("mercury");
		loginPage.getPasswordEditBox().sendKeys("mercury");
		//loginPage.getUserNameEditBox().sendKeys(TestData.getTestDataValue("TC_001","UserName"));
		//loginPage.getPasswordEditBox().sendKeys(TestData.getTestDataValue("TC_001","Password"));
		loginPage.getSignInButton().click();
		
		//BrowserDriver.getDriver().findElement(By.xpath("//input[@name='password']")).sendKeys(TestData.getTestDataValue("TC_001","Password"));
		//System.out.println("Step: Login ---User id is: " + userId + ", Password is: " + password);
	
	}
   /* And Login to app using id as "mercury.user.id" and password as "mercury.user.password"
    When I click on Sign-In button
    Then I navigate to home page
    And check more outcomes*/
	
	
	
}
