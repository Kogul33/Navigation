package InfipixHome;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Form
public class InfipixNavigation {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\hulk\\Downloads\\Windows10backUp\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.navigate().to("http://159.65.157.201");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(5000);

		// About
		driver.findElement(By.id("menu-item-1399")).click();
		Thread.sleep(8000);

		// Services
		WebElement de = driver.findElement(By.id("menu-item-1457"));
		de.click();
		WebElement cloud = driver.findElement(By.linkText("Cloud Services"));
		cloud.click();
		Thread.sleep(5000);

		// Digital Transformation
		WebElement DT = driver.findElement(By.id("menu-item-1457"));
		DT.click();
		WebElement CD = driver.findElement(By.linkText("Digital Transformation"));
		CD.click();
		Thread.sleep(5000);

		// Application Management Outsourcing
		WebElement AMO = driver.findElement(By.id("menu-item-1457"));
		AMO.click();
		driver.findElement(By.linkText("Application Management Outsourcing")).click();
		Thread.sleep(5000);

		// Quality Management Services
		WebElement QMS = driver.findElement(By.id("menu-item-1457"));
		QMS.click();
		driver.findElement(By.linkText("Quality Management Services")).click();
		Thread.sleep(5000);

		// Managed IT Services
		WebElement MIS = driver.findElement(By.id("menu-item-1457"));
		MIS.click();
		driver.findElement(By.linkText("Managed IT Services")).click();
		Thread.sleep(5000);

		// Mobility Services
		WebElement MS = driver.findElement(By.id("menu-item-1457"));
		MS.click();
		driver.findElement(By.linkText("Mobility Services")).click();
		Thread.sleep(5000);

		// Contact
		driver.findElement(By.id("menu-item-1400")).click();
		Thread.sleep(5000);

		// Home
		Thread.sleep(5000);
		driver.findElement(By.id("menu-item-1401")).click();
	}

}
