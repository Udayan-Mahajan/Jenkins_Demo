package org.selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Qkart {
	public static void main(String [] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Udayan Mahajan\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://crio-qkart-frontend-qa.vercel.app/");
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        WebElement search=driver.findElement(By.xpath("//*[@id=\"root\"]/div/d`iv/div[1]/div[2]/div/input"));
        search.click();
        Assert.assertEquals(search.isEnabled(), true);
        search.sendKeys("router");
        WebElement product= driver.findElement(By.xpath("//*[text()=\"Router\"]"));
        Assert.assertEquals(product.getText(), "Router");
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[4]/div[2]/p[1]/a")).isDisplayed(), true);
	}
}
