

//Q1. Write a script to open the Firefox browser and open https://www.google.com/ URL.

package org.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverQ1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Udayan Mahajan\\Downloads\\geckodriver-v0.32.2-win32\\geckodriver.exe");
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement e = driver.findElement(By.cssSelector(""));
	}
}
