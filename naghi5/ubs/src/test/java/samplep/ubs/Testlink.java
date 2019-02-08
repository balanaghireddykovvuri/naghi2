package samplep.ubs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Testlink {
	@Test (groups="action1")
	public void testLinks()
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\training_b4c.06.01\\Downloads\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get("https://www.hdfcbank.com/");
	
	Actions act1=new Actions(driver);
	act1.moveToElement(driver.findElement(By.xpath("//a[@href='/personal/products']")));
	act1.moveToElement(driver.findElement(By.xpath("//a[@href='/personal/products/cards']")));
	act1.moveToElement(driver.findElement(By.xpath("//a[@href='/personal/products/cards/credit_cards']")));
	act1.click(driver.findElement(By.xpath("//a[@href='/personal/products/cards/credit_cards']")));
	act1.perform();
	
	String url=driver.getCurrentUrl();
	Assert.assertTrue(url.contains("credit_cards"));
	}
}
