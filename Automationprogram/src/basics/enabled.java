package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

 public class enabled {
	public static void main(String[]args) {
		{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			Boolean res=driver.findElement(By.name("login")).isEnabled();
			if(res==true)
			{
				System.out.println("login button is enabled");
			}
			else
			{
				System.out.println("login button is not enabled");
				}
		}	
	}
 }


