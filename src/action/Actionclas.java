package action;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/*URL : https://www.shopclues.com/wholesale.html
 
NOTE: Mobile and electronics is first mouseover and click range Rs5001 - Rs10000*/

public class Actionclas {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "D:\\Ajanta\\action\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.shopclues.com/wholesale.html");
		driver.manage().window().maximize();
		Actions a=new Actions(driver);
		Thread.sleep(3000);
		WebElement e = driver.findElement(By.xpath("//a[text()='Mobiles & Electronics']"));
		a.moveToElement(e).perform();
		Thread.sleep(3000);
		WebElement rs = driver.findElement(By.xpath("//a[text()='Rs.5001 - Rs.10000']"));
		rs.click();
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ESCAPE);
		robot.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(3000);
		driver.quit();
}
	}
