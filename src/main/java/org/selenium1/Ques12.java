//Q12. Write an automation script for filling FirstName, LastName & Email address field with the help of name locator.
//(http://demo.automationtesting.in/Register.html)

package org.selenium1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques12 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Udayan Mahajan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys("Udayan");
		driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys("Mahajan");
		driver.findElement(By.xpath("//input[@ng-model=\"EmailAdress\"]")).sendKeys("udayanmj27@gmail.com");
		
	}
}
