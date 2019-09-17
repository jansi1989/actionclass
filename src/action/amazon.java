package action;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/*URL : https://www.amazon.in/

NOTE: Signin is first mouseover
      Click start here 
      Give details for signup.*/
public class amazon {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "D:\\Ajanta\\action\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Actions a=new Actions(driver);
		WebElement acc = driver.findElement(By.xpath("(//span[text()='Account & Lists'])[1]"));
		a.moveToElement(acc).perform();
		Thread.sleep(3000);
		WebElement sign = driver.findElement(By.xpath("(//span[text()='Sign in'])[2]"));
		sign.click();
		Thread.sleep(3000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		driver.findElement(By.id("auth-create-account-link")).click();
		Thread.sleep(3000);
		driver.close();
		
		


}
}