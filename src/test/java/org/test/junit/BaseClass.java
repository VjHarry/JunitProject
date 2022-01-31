package org.test.junit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
// Browser launch	
	public static WebDriver launchBrowser(String browsername) {
		if (browsername=="edge") {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else if(browsername=="chrome") {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else {
			System.err.println("Invalid Browser Name");
		}
		return driver;
	}
// Url Launch	
	public static void launchUrl(String url) {
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
// Implicit wait	
	public static void implicitwait(long sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	}
// Send keys
	public static void fillTextBox(WebElement element,String value) {
		element.sendKeys(value);
	}
// Click
	public static void btnClick(WebElement e) {
		e.click();
	}
// Quit browser
	public static void quitBrowser() {
		driver.quit();
	}	
}
