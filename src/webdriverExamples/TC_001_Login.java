package webdriverExamples;
//Pre-def:
//-to access webdriver methods & classes
import org.openqa.selenium.WebDriver;
//-to access browser
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
//-to access object ind/element loc: methods
import org.openqa.selenium.By;

public class TC_001_Login {
public static void main(String args[]) throws Exception{
 //Test Steps
//interface class
WebDriver driver = new EdgeDriver();
driver.navigate().to("http://183.82.103.245/nareshit/login.php");
System.out.println("Application Opened");
Thread.sleep(3000); //wait stmt
driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
Thread.sleep(3000);
driver.findElement(By.name("Submit")).click();
Thread.sleep(3000);
System.out.println("Login completed");
driver.findElement(By.linkText("Logout")).click();
System.out.println("Logout completed");
Thread.sleep(3000);
System.out.println("Testing Excellent");
driver.close();
}
}