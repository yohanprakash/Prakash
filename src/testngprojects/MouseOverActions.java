package testngprojects;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class MouseOverActions {
	
	public WebDriver driver;
	public Actions action;
	
	
  @Test
  public void f() throws Exception
  {
	  action = new Actions(driver);
	  WebElement ele = driver.findElement(By.linkText("SwitchTo"));
	  action.moveToElement(ele).build().perform();
	  Thread.sleep(3000);
	  driver.findElement(By.linkText("Windows")).click();
	  Thread.sleep(3000);
  }
  @BeforeTest
  public void beforeTest() throws Exception
  {
	  driver = new ChromeDriver();
	  driver.get("http://demo.automationtesting.in/Register.html");
	  Thread.sleep(3000);
	  driver.manage().window().maximize();
  }
  

  @AfterTest
  public void afterTest() {
  }

}
