package basics;

import java.io.InterruptedIOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.indexeddb.model.Key;

public class Sendkeys {
	public static void main(String[]args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("virat@18"+Keys.CONTROL+"Ac");
		driver.findElement(By.id("pass")).sendKeys(Keys.CONTROL+"v");
	}
	}
