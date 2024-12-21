package basics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class handlingdropdowns {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://fb.com");
		driver.findElement(By.linkText("Create new account")).click();
		WebElement month = driver.findElement(By.id("month"));
		Select s=new Select(month);
		Thread.sleep(2000);
		//s.selectByIndex(11);
		List<WebElement> allOptions = s.getOptions();
		for(WebElement ele:allOptions)
		{
			
			System.out.println(ele.getText());
			}
		int count = allOptions.size();
		System.out.println(count);
		s.selectByIndex(count-11);
		
		
		
	

	}

}
