package org.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class q11 {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Udayan Mahajan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html"); // get to the desired url
		driver.findElement(By.xpath("//input[@ng-model='FirstName']")).sendKeys("Udayan");
		driver.findElement(By.xpath("//input[@ng-model='LastName']")).sendKeys("Mahajan");
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("K-179,LIC Colony");
		driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys("udayanmahajan@gmail.com");
		driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("9354414811");
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		driver.findElement(By.xpath("//input[@value='Cricket']")).click();
		driver.findElement(By.id("msdd")).click();
		driver.findElement(By.xpath("//a[text()='English']")).click();
		WebElement address = driver.findElement(By.xpath("//select[@id='country']"));
		Select s = new Select(address);
		s.selectByVisibleText("India");
		driver.findElement(By.id("firstpassword")).sendKeys("abcd@1234");
		driver.findElement(By.id("secondpassword")).sendKeys("abcd@1234");
//		driver.findElement(By.id("submitbtn")).click();
		
		
		//validating that respective gender is selected :
		System.out.println("gender is selected : "+driver.findElement(By.xpath("//input[@value='Male']")).isSelected());
		
		//validating that header of the registration page is Automation Demo Site.
		String s1 = driver.findElement(By.tagName("h1")).getText();
		System.out.print("header is {automation demo site} : ");
		if("Automation Demo Site".equalsIgnoreCase(s1)) {
			System.out.print(" true");
		}
		else {
			System.out.print(" false");
		}
		
		//validating that title of page is Register
		System.out.println("");
		System.out.print("title of page is {Register}");
		if("Register".equalsIgnoreCase(driver.getTitle())){
			System.out.print(" true");
		}
		else {
			System.out.print(" false");
		}
	}
}
