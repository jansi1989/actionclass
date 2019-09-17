package action;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/*URL : https://www.homedepot.com/

NOTE: Alldepartment  is first mouseover
      Heating and cooling  is second  mouseover
      Air conditioners is third mouseover 
      Click portable air conditioners.*/

public class Homedepot {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "D:\\Ajanta\\action\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.homedepot.com/");
		driver.manage().window().maximize();
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ESCAPE);
		robot.keyRelease(KeyEvent.VK_ESCAPE);
		Actions a=new Actions(driver);
        WebElement all = driver.findElement(By.xpath("//a[text()='All Departments']"));
        a.moveToElement(all).perform();
		Thread.sleep(3000);
        WebElement daw = driver.findElement(By.xpath("(//a[text()='Heating & Cooling'])[1]"));
        a.moveToElement(daw).perform();
		Thread.sleep(3000);
		WebElement ac = driver.findElement(By.xpath("(//a[text()='Air Conditioners'])[1]"));
		a.moveToElement(ac).perform();
		Thread.sleep(3000);
		WebElement pro = driver.findElement(By.xpath("(//a[text()='Portable Air Conditioners'])[1]"));
		pro.click();
		Thread.sleep(3000);
		driver.close();
}
	
}
