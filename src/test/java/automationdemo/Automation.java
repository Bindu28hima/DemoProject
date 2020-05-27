package automationdemo;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {
	
	@Test
	public void facebookloginpage() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ravi\\git\\DemoProject\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("http://demo.automationtesting.in/Register.html");

		driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys("Hima");
		
		driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys("Bindu");
		
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("mgasyugvu");

}
}