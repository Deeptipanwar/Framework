package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public interface BrowserUtilities {

	public void launchBrowser(String browser) throws Exception;
	public boolean isDisplayed(WebElement ele);
	public void ufClick(WebElement ele);
	public void ufSendKeys(WebElement ele, String keysToSend);
}
