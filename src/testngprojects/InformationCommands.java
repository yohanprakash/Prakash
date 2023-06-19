package testngprojects;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class InformationCommands {
	
	public WebDriver driver;
	
  @Test(priority=1)
  
  public void Gmail() throws Exception {
	  
	  String str1 = driver.findElement(By.linkText("Gmail")).getText();
	  System.out.println(str1);
	  
  }
  
 @Test(priority=2)
  
  public void google_image() throws Exception {
	  
	  
	  String str2 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/img")).getAttribute("alt");
	  
	  System.out.println(str2);
 }
	  
	  
@Test(priority=3)
	  
	  
	  public void search_button() throws Exception {
		  
		  String str3 = driver.findElement(By.name("btnK")).getAttribute("value");
		  System.out.println(str3);

}
  @BeforeTest
  public void beforeTest() {
	  
	  //WebDriverManager.Chromedriver.setup();
	  
	  driver = new ChromeDriver();
	  driver.get("https://www.google.com/");
	 
	  driver.manage().window().maximize();
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
