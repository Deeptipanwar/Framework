package Utilities;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;



public class TestBase {

	public static WebDriver driver;
	public static String sHost;
	public static String sScreenShotName;
	public static String sClassNameForScreenShot;
	public static String sErrorMessage="";
	public static BrowserUtilities oBroUti = new BrowserUtility();
	
	@BeforeSuite
	public static void launchTheBrowser() throws Exception {
		oBroUti.launchBrowser("chrome");
	}
}
