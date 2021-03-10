package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import util.BrowserFactory;

public class LoginTest {

WebDriver driver;

@Test
@Parameters({"username", "password"})

public void validUserShouldBeAbleToLogin(String userName, String password) {
	
	driver= BrowserFactory.init();
}




}
