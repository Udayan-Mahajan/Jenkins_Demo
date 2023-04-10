package org.selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Udayan Mahajan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver c=new ChromeDriver();
//		c.navigate().to("https://www.google.com/");
		c.get("https://demoqa.com/automation-practice-form/");
		c.manage().window().maximize();
//		c.findElement(By.id("first-name")).sendKeys("Udayan");
//		c.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		c.findElement(By.xpath("//input[@id=\"firstName\"]")).sendKeys("Udayan");
//		c.findElement(By.xpath("//input[@id=\"lastName\"]")).sendKeys("Mahajan");
//		c.findElement(By.xpath("//input[@placeholder=\"name@example.com\"]")).sendKeys("udayan@gmail.com");
//		c.findElement(By.xpath("//textarea[@placeholder=\"Current Address\"]")).sendKeys("K-179 LIC Colony");
//		c.findElement(By.xpath("//input[@placeholder=\"Mobile Number\"]")).sendKeys("9899189279");
//		c.findElement(By.xpath("//input[@id=\"subjectsInput\"]")).sendKeys("Random Subject");
//		c.findElement(By.xpath("//label[@for=\"hobbies-checkbox-1\"]")).click();
//		c.findElement(By.xpath("//label[@for=\"gender-radio-1\"]")).click();
//		


		//input[@id="hobbies-checkbox-1"]
//		c.close();
	}

}
