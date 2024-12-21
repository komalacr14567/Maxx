package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginactitime {
	private static final char[] title = null;

	public static void main(String[]args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(0));
		driver.get("https://online.actitime.com/ssandeep");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='login']")).click();
		wait.until(ExpectedConditions.titleContains("Enter Time"));
		String.title=driver.getTitle();
		System.out.println(title);
		}
}
