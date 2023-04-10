//Q6.  Write a script to get the url of the "Contact Us' page.
package org.selenium1;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class OpenTTN {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Udayan Mahajan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get(" http://www.tothenew.com/ ");
		driver.manage().window().maximize();
		List<WebElement> id=driver.findElements(By.id("h-contact-us"));
		WebElement contactbtn = id.get(1);
		contactbtn.click();
		System.out.println(driver.getCurrentUrl());
}
}