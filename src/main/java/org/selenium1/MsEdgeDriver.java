
//Q2. Write a script launch the IE browser and open https://www.google.com/ URL.
package org.selenium1;

import org.openqa.selenium.edge.EdgeDriver;

public class MsEdgeDriver {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\Udayan Mahajan\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}
}
