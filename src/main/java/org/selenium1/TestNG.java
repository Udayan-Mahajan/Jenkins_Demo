package org.selenium1;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG {
	
	WebDriver driver;
	Actions action;
	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Udayan Mahajan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.tothenew.com/");
	}
	
@Test
public void scrollfn() throws InterruptedException {
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("window.scrollBy(0,1000)"); // scrolling down 1000 px using javascript
	 Thread.sleep(2000);
	 js.executeScript("window.scrollBy(0,-500)"); // scrolling up 500 px using javascript	
}
@AfterMethod
public void afterMethod() throws InterruptedException {
	 Thread.sleep(5000);
	 driver.close();
}
}


//	WebDriver driver;
//	@BeforeMethod
//	public void beforeMethod() {
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\Udayan Mahajan\\Downloads\\chromedriver_win32\\chromedriver.exe");
//		driver = new ChromeDriver();
//		
//		driver.manage().window().maximize();
//	}
//	
//  @Test
//  public void dragAndDrop() {
//	  driver.get("https://demoqa.com/droppable/");
//	  WebElement draggable= driver.findElement(By.id("draggable"));
//      WebElement droppable = driver.findElement(By.id("droppable"));
//      Actions act = new Actions(driver);
//      act.dragAndDrop(draggable, droppable).build().perform();
//  }
//  
//  @Test
//  public void Rightclick() throws InterruptedException{
//	  driver.get("https://demoqa.com/links");
//      WebElement we = driver.findElement(By.id("bad-request"));
//      JavascriptExecutor js = (JavascriptExecutor)driver;
//      js.executeScript("window.scrollBy(0,500)");
//      Actions ac = new Actions(driver);
//      ac.contextClick(we).perform();
//      Thread.sleep(5000);
//  }
//
//
//  @AfterMethod
//  public void afterMethod() {
//	driver.quit();
//  }
//}


//WebDriver driver;
//	
//	@BeforeMethod
//	public void launch() {
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\Udayan Mahajan\\Downloads\\chromedriver_win32\\chromedriver.exe");
//		driver = new ChromeDriver();
//		
//		driver.manage().window().maximize();
//		driver.get("https://www.amazon.in/");
//	}
//	
//  @Test
//  public void testHomePage() {
//	  String expectedTitle = "Amazon";
//	  String actualTitle = driver.getTitle();
//	  System.out.println(actualTitle);
//	  Assert.assertTrue(actualTitle.contains(expectedTitle)); // asserting that title contains amazon
//	  
//	  String expectedURL = "https://www.amazon.in/";
//	  String actualURL = driver.getCurrentUrl();
//	  System.out.println(actualURL);
//	  Assert.assertTrue(actualURL.contains(expectedURL)); // asserting that we land on right url
//	  
//	  Assert.assertTrue(driver.findElement(By.id("nav-logo")).isDisplayed()); // assert that main logo is dsiplayed
//  }
//  
//  @Test
//  public void testSearchPage() {
//	    String searchTerm = "toothpaste";
//	    WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
//	    System.out.println(searchBox.getCssValue("color"));
//	    searchBox.sendKeys(searchTerm);
//	    searchBox.submit();
//	    String expectedTitle = "Amazon.in : " + searchTerm;
//	    String actualTitle = driver.getTitle();
//	    Assert.assertEquals(actualTitle, expectedTitle); // assert that title is same as searched item
//	    
//	    String expectedURL = "https://www.amazon.in/s?k=toothpaste&ref=nb_sb_noss";
//		String actualURL = driver.getCurrentUrl();
//		System.out.println(actualURL);
//		Assert.assertTrue(actualURL.contains(expectedURL)); // asserting that we land on right url
//	    
//	    String expected = "RESULTS";
//	    String actual = driver.findElement(By.xpath("//span[text()=\"RESULTS\"]")).getText();
//	    Assert.assertEquals(actual, expected); // asserting that result page is shwoing a heading 'RESULTS'
//	  }
//
//  
//  @Test
//  public void testCart() throws InterruptedException{
//	  WebElement cartbutton = driver.findElement(By.id("nav-cart-count-container"));
//	  cartbutton.click();
//	  
//	  String expectedURL = "https://www.amazon.in/gp/cart/view.html?ref_=nav_cart";
//	  String actualURL = driver.getCurrentUrl();
//	  System.out.println(actualURL);
//	  Assert.assertTrue(actualURL.contains(expectedURL)); // asserting that we land on right url 
//	  
//	  String expectedmessage = "Your Amazon Cart is empty";
//	  String actualmessage = driver.findElement(By.xpath("//*[@id=\"sc-active-cart\"]/div/div/div[2]/div[1]/h2")).getText();
//	  Assert.assertEquals(actualmessage, expectedmessage); // asserting that before adding anything cart is empty
//	  
//	  driver.navigate().back(); // back to homepage
//	  
//	  String searchTerm = "toothpaste";
//	  WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
//	  searchBox.sendKeys(searchTerm);
//	  searchBox.submit();
//	  
//	  driver.findElement(By.xpath("//h2[1]//a[1]")).click();
//	  Set<String> allhandles = driver.getWindowHandles();
//	  driver.switchTo().window(allhandles.stream().toList().get(1)); //switching to the new tab
//	  
//	  driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[1]")).click();
//	  
//	  String expectedmessage1 = "Added to Cart";
//	  String actualmessage1 = driver.findElement(By.xpath("//*[@id=\"NATC_SMART_WAGON_CONF_MSG_SUCCESS\"]/span")).getText();
//	  Assert.assertEquals(actualmessage1, expectedmessage1); // asserting that item is added message is there
//	  
//	  driver.findElement(By.id("nav-cart-count-container")).click();// going back to cart
//	  
//	  Assert.assertTrue(driver.findElement(By.xpath("//form[@id='activeCartViewForm']")).isDisplayed()); // assert that there are some items in cart
//	  
//	  Thread.sleep(10000);
//	  
//  }
//  
//  @AfterMethod
//  public void close() {
//	  driver.quit();
//  }
//
//}

//WebDriver driver;
//	
//	
//	@BeforeMethod
//	public void launch() {
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\Udayan Mahajan\\Downloads\\chromedriver_win32\\chromedriver.exe");
//		driver = new ChromeDriver();
//		
//		driver.manage().window().maximize();
//		driver.get("https://www.amazon.in/");
//	}
//	
//@Test
//public void testHomePage() {
//	 String expectedTitle = "Amazon";
//	 String actualTitle = driver.getTitle();
//	 System.out.println(actualTitle);
//	 Assert.assertTrue(actualTitle.contains(expectedTitle)); // asserting that title contains amazon
//	
//	 String expectedURL = "https://www.amazon.in/";
//	 String actualURL = driver.getCurrentUrl();
//	 System.out.println(actualURL);
//	 Assert.assertTrue(actualURL.contains(expectedURL)); // asserting that we land on right url
//	
//	 Assert.assertTrue(driver.findElement(By.id("nav-logo")).isDisplayed()); // assert that main logo is dsiplayed
//}
//@Test
//public void testSearchPage() {
//	 String searchTerm = "toothpaste";
//	 WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
//	 searchBox.sendKeys(searchTerm);
//	 searchBox.submit();
//	 String expectedTitle = "Amazon.in : " + searchTerm;
//	 String actualTitle = driver.getTitle();
//	 Assert.assertEquals(actualTitle, expectedTitle); // assert that title is same as searched item
//	
//	 String expectedURL = "https://www.amazon.in/s?k=toothpaste&ref=nb_sb_noss";
//		String actualURL = driver.getCurrentUrl();
//		System.out.println(actualURL);
//		Assert.assertTrue(actualURL.contains(expectedURL)); // asserting that we land on right url
//	
//	 String expected = "RESULTS";
//	 String actual = driver.findElement(By.xpath("//span[text()=\"RESULTS\"]")).getText();
//	 Assert.assertEquals(actual, expected); // asserting that result page is shwoing a heading 'RESULTS'
//	 }
//@Test
//public void testCart() throws InterruptedException{
//	 WebElement cartbutton = driver.findElement(By.id("nav-cart-count-container"));
//	 cartbutton.click();
//	
//	 String expectedURL = "https://www.amazon.in/gp/cart/view.html?ref_=nav_cart";
//	 String actualURL = driver.getCurrentUrl();
//	 System.out.println(actualURL);
//	 Assert.assertTrue(actualURL.contains(expectedURL)); // asserting that we land on right url
//	
//	 String expectedmessage = "Your Amazon Cart is empty";
//	 String actualmessage = driver.findElement(By.xpath("//*[@id=\"sc-active-cart\"]/div/div/div[2]/div[1]/h2")).getText();
//	 Assert.assertEquals(actualmessage, expectedmessage); // asserting that before adding anything cart is empty
//	
//	 driver.navigate().back(); // back to homepage
//	
//	 String searchTerm = "toothpaste";
//	 WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
//	 searchBox.sendKeys(searchTerm);
//	 searchBox.submit();
//	
//	 driver.findElement(By.xpath("//h2[1]//a[1]")).click();
//	 Set<String> allhandles = driver.getWindowHandles();
//	 driver.switchTo().window(allhandles.stream().toList().get(1)); //switching to the new tab
//	
//	 driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[1]")).click();
//	
//	 String expectedmessage1 = "Added to Cart";
//	 String actualmessage1 = driver.findElement(By.xpath("//*[@id=\"NATC_SMART_WAGON_CONF_MSG_SUCCESS\"]/span")).getText();
//	 Assert.assertEquals(actualmessage1, expectedmessage1); // asserting that item is added message is there
//	
//	 driver.findElement(By.id("nav-cart-count-container")).click();// going back to cart
//	
//	 Assert.assertTrue(driver.findElement(By.xpath("//form[@id='activeCartViewForm']")).isDisplayed()); // assert that there are some items in cart
//	
//	 Thread.sleep(10000);
//	
//}
//@AfterMethod
//public void close() {
//	 driver.quit();
//}
//}


//	WebDriver driver;
//	@BeforeMethod
//	public void launch() {
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\Udayan Mahajan\\Downloads\\chromedriver_win32\\chromedriver.exe");
//		driver = new ChromeDriver();
//		
//		driver.manage().window().maximize();
//		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//	}
//	
//@Test
//public void handleRadioButton() throws InterruptedException {
//	 WebElement rb = driver.findElement(By.xpath("//table[@id='ctl00_mainContent_rbtnl_Trip']//tbody/tr[1]/td[1]/input"));
//	 rb.click(); // handle radio button choice 1
//	 Thread.sleep(2000);
//	 rb = driver.findElement(By.xpath("//table[@id='ctl00_mainContent_rbtnl_Trip']//tbody/tr[1]/td[2]/input"));
//	 rb.click(); // handle radio button choice 2
//	 Thread.sleep(2000);
//	 rb = driver.findElement(By.xpath("//table[@id='ctl00_mainContent_rbtnl_Trip']//tbody/tr[1]/td[3]/input"));
//	 rb.click(); // handle radio button choice 3
//	 Thread.sleep(2000);
//}
//@Test
//public void handleDynDropdown() throws InterruptedException {
//	 WebElement field1 = driver.findElement(By.xpath("(//input[@id='ctl00_mainContent_ddl_originStation1_CTXT'])[1]"));
//	 field1.sendKeys("delhi"); // handling dropdown
//	 Thread.sleep(2000);
//	
//	 WebElement field2 = driver.findElement(By.xpath("(//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT'])[1]"));
//	 field2.sendKeys("mumbai"); // handling dropdown
//	 Thread.sleep(2000);
//	
////	 WebElement departureDate = driver.findElement(By.xpath("//button[@class='ui-datepicker-trigger'])[1]")); //select departure date
////	 departureDate.click();
//	 int x = 25; // custom input date
//	 driver.findElement(By.xpath("//table[@class=\"ui-datepicker-calendar\"]/tbody/tr/td/a[text()="+x+"]")).click();
//	 Thread.sleep(2000);
//	
//	 WebElement arrivalDate = driver.findElement(By.xpath("(//input[@id='ctl00_mainContent_view_date2'])[1]")); //select arrival date
//	 arrivalDate.click();
//	 int y = 27; // custom input date
//	 driver.findElement(By.xpath("//table[@class=\"ui-datepicker-calendar\"]/tbody/tr/td/a[text()="+y+"]")).click();
//	 Thread.sleep(2000);
//	
//	 WebElement passenger = driver.findElement(By.xpath("(//div[@id='divpaxinfo'])[1]")); // select passengers
//	 passenger.click();
//	 Thread.sleep(2000);
//	 driver.findElement(By.xpath("(//span[@id='hrefIncAdt'])[1]")).click();
//	 Thread.sleep(2000);
//	 driver.findElement(By.xpath("(//input[@id='btnclosepaxoption'])[1]")).click();
//	 Thread.sleep(2000);
//	
//	 WebElement submit = driver.findElement(By.xpath("(//input[@id='ctl00_mainContent_btn_FindFlights'])[1]"));
//	 submit.click(); //click submit button
//	
//}
//@AfterMethod
//public void close() {
//	
//	 driver.close();
//}
//}

//	
//	private static WebDriver driver;
//	@BeforeMethod
//	public void launch() {
//		System.setProperty("webdriver.gecko.driver","C:\\Users\\Udayan Mahajan\\Downloads\\geckodriver-v0.32.2-win32\\geckodriver.exe");
//		driver = new FirefoxDriver();
//		driver.get("https://demoqa.com/automation-practice-form");
//		driver.manage().window().maximize();
//		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//	}
//	
//@Test
//public void f() throws InterruptedException {
//	 WebElement alertbutton = driver.findElement(By.xpath("//input[@id='alertbtn']"));
//	 alertbutton.click();
//	 Alert popup = driver.switchTo().alert();
//	 System.out.println(popup.getText()); // to Fetch the alert popup text.
//	 Thread.sleep(3000);
//	 popup.dismiss(); //to dismiss the popup
//	 Thread.sleep(3000);
//}
//@Test
//public void dataEnter() throws InterruptedException {
//	 WebElement input = driver.findElement(By.xpath("//input[@id='name']"));
//	 input.sendKeys("Udayan"); // enter data on input field
//	 WebElement confirmbtn = driver.findElement(By.xpath("//input[@id='confirmbtn']"));
//	 confirmbtn.click();
//	 Alert popup = driver.switchTo().alert();
//	 Thread.sleep(3000);
//	 popup.accept();//accept the popup
//	 Thread.sleep(3000);
//}
//
//
//
//
//@AfterMethod
//public void close() {
//	 driver.quit();
//}
//}
//
//	
//    @BeforeTest
//    public void launch() {
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Udayan Mahajan\\Downloads\\chromedriver_win32\\chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
//        driver.manage().window().maximize();
//       
//    }
    
//    @Test
//    public void demo(){
//    	WebElement fname =driver.findElement(By.xpath("//*[@id=\"firstName\"]"));
//     	WebElement lname =driver.findElement(By.xpath("//*[@id=\"lastName\"]"));
//     	WebElement email =driver.findElement(By.xpath("//*[@id=\"userEmail\"]"));
//     	WebElement mlen = driver.findElement(By.xpath("//*[@id=\"userNumber\"]"));
//		fname.sendKeys("Udayan");
//		lname.sendKeys("Mahajan");
//		email.sendKeys("udayanmj27@gmaill.com");
//		mlen.sendKeys("9899189279");
//		System.out.println(fname.isDisplayed());
//
//
//    }
//    
//    @Test 
//    public void demo1() {
//    	String str=driver.findElement(By.xpath("//h5")).getText();
//		Assert.assertEquals(str.length(),25);
//		
//        
//        
//    r
//    @Test
//    public void newTab() {
//	    	WebElement newTab=driver.findElement(By.xpath("//*[@id=\"tabButton\"]"));
//	    	WebElement newWindow=driver.findElement(By.xpath("//*[@id=\"windowButton\"]"));
//	    	WebElement newWindowMsg=driver.findElement(By.xpath("//*[@id=\"messageWindowButton\"]"));
//	    	newTab.click();
//	    	Set<String> whandler=driver.getWindowHandles();
//	    	driver.switchTo().window(whandler.stream().toList().get(1));
//	    	WebElement heading=driver.findElement(By.xpath("//*[@id=\"sampleHeading\"]"));
//	    	Assert.assertEquals(heading.getText(),"This is a sample page");
//	    	Actions a= new Actions(driver);
//	    	
//    }
//    @Test(priority = 0)
//    public void validateLandingPage() {
//    	WebElement login=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/h5"));
//    	Assert.assertEquals(login.getText(),"Login");
//    	
//    	
//    	
//    }
//    @Test(priority = 1)
//    public void credentialsChecker() throws InterruptedException, AWTException {
//	    WebElement user=driver.findElement(By.xpath("//input[@placeholder=\"Username\"]"));
//	    user.sendKeys("Admin");
//	    WebElement pass=driver.findElement(By.xpath("//input[@placeholder=\"Password\"]"));
//	    pass.sendKeys("admin123");
//	    WebElement auth=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
//	    auth.click();
//	    driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")).click();
//    	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")).click();
//    	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div")).click();
//    	 Robot rb = new Robot();
//         rb.keyPress(KeyEvent.VK_DOWN);
//         Thread.sleep(2000);
//         rb.keyPress(KeyEvent.VK_DOWN);
//         Thread.sleep(2000);
//         rb.keyPress(KeyEvent.VK_ENTER);
//         
//         Thread.sleep(2000);
//         WebElement w1 =driver.findElement(By.xpath("//input[@placeholder='Type for hints...']"));
//         w1.click();
//         w1.sendKeys("p");
//         Thread.sleep(10000);
//         WebDriverWait wd = new WebDriverWait(driver, 10);
//         wd.until(ExpectedConditions.visibilityOf(w1));
//         rb.keyPress(KeyEvent.VK_DOWN);
//         Thread.sleep(4000);
//         rb.keyPress(KeyEvent.VK_DOWN);
//         Thread.sleep(4000);
//         rb.keyPress(KeyEvent.VK_DOWN);
//         Thread.sleep(4000);
//         rb.keyPress(KeyEvent.VK_ENTER);
//         Thread.sleep(2000);
//         driver.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]")).click();
//         rb.keyPress(KeyEvent.VK_DOWN);
//         Thread.sleep(2000);
//         rb.keyPress(KeyEvent.VK_DOWN);
//         Thread.sleep(2000);
//         rb.keyPress(KeyEvent.VK_ENTER);
//         driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("Udayan");
//         Thread.sleep(2000);
//         driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("Admin@12345");
//         driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Admin@12345");
//         driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")).click();
//         
         

         
 //
         
    	
    	
    	
    	

//    @Test
//    public void adminCreater() throws InterruptedException {
//    	Thread.sleep(3000);
//    	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")).click();
//    	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")).click();
//    	
//    }
    
//    @AfterTest
////    public void closebrowser() {
////        driver.quit();
        
 


//}





    