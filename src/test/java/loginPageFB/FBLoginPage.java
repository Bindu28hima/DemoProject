package loginPageFB;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBLoginPage {


	@Test
	public void facebookloginpage() {

		System.setProperty("webdriver.chrome.driver", "C:\\java programs\\jenkins-demo\\drivers\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();
	}

}



