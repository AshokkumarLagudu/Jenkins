package jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test
public class TestMavenJenkins {
	
	WebDriver driver;
	public void openFB(){
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumPract\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://facebook.com");
	}

}
