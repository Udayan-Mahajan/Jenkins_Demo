package org.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Udayan Mahajan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver c=new ChromeDriver();
		c.get("https://demo.guru99.com/test/newtours/register.php");
		c.manage().window().maximize();
		WebElement add=c.findElement(By.xpath("//select[@name=\"country\"]"));
		Select s=new Select(add);
		s.selectByVisibleText("INDIA");
		s.getFirstSelectedOption();
		
			//*[@id="rt-feature"]/div/div[1]/div/div/div/div[2]/h2/parent::div//div
}
}
