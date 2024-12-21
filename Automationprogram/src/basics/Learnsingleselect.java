package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Learnsingleselect {
	public static void main(String[]args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("create new account")).click();
		WebElement month=driver.findElement(By.id("month"));
		Select s=new Select(month);
		Thread.sleep(2000);
		s.selectByIndex(5); Thread.sleep(2000);
		s.selectByValue("2"); Thread.sleep(2000);
		s.selectByVisibleText("Dec");
		s.deselectByIndex(5);
		}
}
