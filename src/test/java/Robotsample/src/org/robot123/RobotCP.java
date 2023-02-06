package org.robot123;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotCP {
	public static void main(String[] args) throws  AWTException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\My Note Book\\eclipse-workspace\\Robotsample\\driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize(); 
			
			Actions a=new Actions(driver);
			
			WebElement email=driver.findElement(By.id("email"));
			email.sendKeys("email");
			
			a.doubleClick(email).perform();
			a.contextClick().perform();
			
			Robot r=new Robot();
			for(int i=0;i<3;i++) {
				
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);
			}
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
				
				r.keyPress(KeyEvent.VK_TAB);
				r.keyRelease(KeyEvent.VK_TAB);
				
				WebElement password=driver.findElement(By.id("pass"));
				a.contextClick(password).perform();
				
				for(int i=0;i<4;i++)
				{
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);
				}
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
			}
}


