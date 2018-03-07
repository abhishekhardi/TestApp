package testeros;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class FFDemo {

	public static void main(String[] args) {
		WebDriver driver;
		String url = "https://www.google.com";
		System.setProperty("webdriver.gecko.driver", "C://Users//abhishekh//Desktop//Eclipse//geckodriver-v0.19.0-win64//geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}

}
