package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchApplication {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://leaftaps.com/opentaps/");
Thread.sleep(2000);
System.out.println("Scenario 1 : Positive flow ");
driver.get("http://leaftaps.com/opentaps/control/login");
//driver.findElementById("username").sendKeys("Demosalesmanager");
driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
//driver.findElementById("password").sendKeys("crmsfa");
driver.findElement(By.id("password")).sendKeys("crmsfa");
//driver.findElementByClassName("decorativeSubmit").click();
driver.findElement(By.className("decorativeSubmit")).click();
driver.close();


	}

}
