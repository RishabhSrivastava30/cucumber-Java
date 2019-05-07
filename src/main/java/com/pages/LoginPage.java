package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, LoginPage.class);	
	}
	
	@FindBy(name="userName")
	private WebElement userNameEditBox;
	
	@FindBy(name="password")
	private WebElement passwordEditBox;
	
	@FindBy(name="login")
	private WebElement signInButton;
	
	public WebElement getUserNameEditBox() {
		return this.userNameEditBox;
	}
	
	public WebElement getPasswordEditBox() {
		return this.passwordEditBox;
	}
	
	public WebElement getSignInButton() {
		return this.signInButton;
	}
	
}
