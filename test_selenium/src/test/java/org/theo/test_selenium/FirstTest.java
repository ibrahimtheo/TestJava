package org.theo.test_selenium;

import org.openqa.selenium.WebDriver;
import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	Thread t1 = new Thread(new Runnable() {
		
	public void run()
	
	{
		
	try {
		Thread.sleep(10);
	
	}
	catch(InterruptedException e) {
		e.printStackTrace();
	}
	System.setProperties(null);
	WebDriver driver = new ChromeDriver();	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(35));
	driver.get("https://google.com");
	driver.close();
		
	}
					
	});
			
	t1.setName("Theo Test Thread");
	t1.start();
		
		

	}

}
