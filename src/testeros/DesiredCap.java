package testeros;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCap {

	public static void main(String[] args) {
		WebDriver driver;
		String url = "http://www.google.com";
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setBrowserName("firefox");
		caps.setPlatform(Platform.WINDOWS);
		driver = new FirefoxDriver(caps);
		//System.setProperty("webdriver.gecko.driver", "C://Users//abhishekh//Desktop//Eclipse//geckodriver-v0.19.0-win64//geckodriver.exe");
		driver.get(url);
		

	}

}
