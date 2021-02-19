package Po_login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utilities.TestBase;

public class Po_login extends TestBase {

	@FindBy(xpath = "//input[@id='email_field']")
	WebElement ph_username;
	@FindBy(id="password_field")
	WebElement ph_password;
	@FindBy(xpath="//button[@onclick='login()']")
	WebElement button_loginToAccount;
	@FindBy(xpath="//a[contains(text(),'Home')]")
	WebElement button_Home;
	
	public boolean loginToTekApp() throws Exception{
		boolean bRes_Flag=false;
		//oBroUti.waitForElementVisible(driver, ph_username, 5);
		oBroUti.ufSendKeys(ph_username, System.getProperty("td_emailId"));
		oBroUti.ufSendKeys(ph_password, System.getProperty("td_password"));
		oBroUti.ufClick(button_loginToAccount);
		//oBroUti.waitForElementVisible(driver, button_Home, 5);
		if(oBroUti.isDisplayed(button_Home))
			bRes_Flag=true;
		return bRes_Flag;
	}
}
