package Login;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import com.tekarch.pologin.pologinTekApp;

import Po_login.Po_login;
import Utilities.TestBase;

public class login extends TestBase{
	Po_login login=new Po_login();
	
	@BeforeTest
	public void settingUpEnvironment() throws Exception {
		sErrorMessage = "";
		sClassNameForScreenShot = getClass().getSimpleName();
		driver.get("https://qa-tekarch.firebaseapp.com/");
		
	}
	@Test
	public void to_Check_Whether_Login_Happening_Or_Not() throws Exception {
		
		 login.loginToTekApp();
	}
}
