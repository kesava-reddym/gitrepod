package example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTest {
	
  @Test
  public void TC001() throws InterruptedException {
	  
	  WebDriver driver=new FirefoxDriver();
	  driver.get("http://www.google.co.in");
	  Thread.sleep(5000);
	  driver.quit();
  }
}
