package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	WebDriver driver;
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
	}
	public void launchUrl(String url) {
		driver.get(url);
	}
	public void send(By loc , String value) {
		try {
			driver.findElement(loc).clear();
			driver.findElement(loc).sendKeys(value);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public void click(By loc) {
		try {
			driver.findElement(loc).click();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public String getText(By loc) {
		String txt = driver.findElement(loc).getText();
		
		return txt;
		
	}
	public void closeBrowser() throws InterruptedException {
		driver.close();		
	}
}
