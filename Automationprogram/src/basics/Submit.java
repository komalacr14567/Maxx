package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Submit {
	public static Void main(String[]args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("login")).submit();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("Sign up")).submit();
		return null;
	
	}

}
