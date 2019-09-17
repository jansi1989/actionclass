package action;

import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/*URL : http://www.greenstechnologys.com/selenium-course-content.html

NOTE: Courses  is first mouseover
      DataWarehouse training is second mouse over
      click microstategy training.*/
public class Greenstechnologys {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "D:\\Ajanta\\action\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Actions a=new Actions(driver);
		WebElement cor = driver.findElement(By.xpath("//a[text()='COURSES']"));
		WebElement war = driver.findElement(By.xpath("//span[text()='Data Warehousing Training ']"));
		WebElement mic = driver.findElement(By.xpath("//span[text()='Microstrategy Training']"));
		a.moveToElement(cor).perform();
		a.moveToElement(war).perform();
		mic.click();
		Thread.sleep(3000);
		driver.quit();
}
}