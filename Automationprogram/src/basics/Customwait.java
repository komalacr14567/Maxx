package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Customwait {
public static void main(String[] args)throws InterruptedException
{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://online.actitime.com/ssandeep/administration/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager"+Keys.ENTER);
		for(int i=0;i<1000;i++)
		{
			try
			{
				driver.findElement(By.xpath("//a[@id='logoutlink'])[2]")).click();
				break;
			}
			catch(NoSuchElementException e)
			{
				System.out.println(i);
			}
		}
	}

				
				
				
				
				
				
			
	
			}

		}
	}

}
