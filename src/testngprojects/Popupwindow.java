package testngprojects;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.service.DriverCommandExecutor;
import org.testng.annotations.AfterTest;

public class Popupwindow {
	
	public WebDriver driver;

	
  @Test
  public void windowpopup() throws Exception {
	  
	  //click on Open New Separate window
	  
		driver.findElement(By.xpath("//a[@href='#Seperate'][contains(.,'Open New Seperate Windows')]")).click();
		
		Thread.sleep(3000);
		
		//click button
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary'][contains(.,'click')]")).click();
		
	     Thread.sleep(3000);
	  
		// Come back to Parent window handle
	     
		String backtoParentwinow = driver.getWindowHandle();


		      //handling Child window 
			  for(String childwindowandle : driver.getWindowHandles()) {
			  
			  //Switch to Child window 
			  driver.switchTo().window(childwindowandle);
			  
			  }
			 
		  driver.manage().window().maximize();
		 
       Thread.sleep(5000);

		// Clicks on Blog_Button
		driver.findElement(By.xpath("//span[contains(text(),'Blog')]")).click();
      Thread.sleep(3000);

		driver.close();

		Thread.sleep(3000);

		// Again Switch focus back to Parent window
		driver.switchTo().window(backtoParentwinow);
      Thread.sleep(10000);

		// Clicks on Home_Button
		driver.findElement(By.linkText("Home")).click();
		Thread.sleep(3000);
	}

	  
  @BeforeTest
  public void beforeTest() throws Exception {
	  
	 // WebDriverManager.chromedriver.setup();
	  
	  driver = new ChromeDriver();
	  
	  driver.get("http://demo.automationtesting.in/Windows.html");
	  
	 Thread.sleep(3000);
	 
	 driver.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
