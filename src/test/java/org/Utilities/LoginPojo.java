package org.Utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;


public class LoginPojo extends BaseClass {

	
	public LoginPojo() {
		
		PageFactory.initElements(driver, this);
	}
	@CacheLookup
	//AND
	@FindBys({
	@FindBy(id="email"),
	@FindBy(xpath="//input[@placeholder='Your Email']")
	})
	private WebElement txtUser;
	
	@CacheLookup
	//OR
	@FindAll({
		@FindBy(id="apple"),
		@FindBy(xpath="//input[@placeholder='Password']")
		})
	private WebElement txtPass;	
	
	@CacheLookup
	
	@FindBy(xpath="//button[@name='send']")
	private WebElement btnLogin;
	
	public WebElement getTxtUser() {
		return txtUser;
	}
	
    public WebElement getTxtPass() {
	    return txtPass;
    }
	public WebElement getBtnLogin() {
		return btnLogin;
	}
	

	
	
	
	

}
