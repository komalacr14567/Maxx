package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropsdown {
public static void main(String[] arg) throws InterruptedException
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://fb.com");
	driver.findElement(By.linkText("Create new account")).click();
	WebElement day = driver.findElement(By.id("day"));
	Select s=new Select(day);
	Thread.sleep(2000);
	s.selectByIndex(7);
	WebElement month = driver.findElement(By.id("month"));
	Select s1=new Select(month);
	Thread.sleep(2000);
	s1.selectByIndex(6);
	WebElement year= driver.findElement(By.id("year"));
	Select s2=new Select(year);
	Thread.sleep(2000);
	s2.selectByVisibleText("1981");
}
}
