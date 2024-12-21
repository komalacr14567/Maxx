package basics;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class InSortedOrder {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("file:///C:/Users/Lenovo/Desktop/Demo.html");
		WebElement city=driver.findElement(By.id("city"));
		Select s=new Select(city);
		List<String> aI=new ArrayList<String>();
		List<WebElement> allopt=s.getOptions();
		for(int i=0;i<allopt.size();i++)
		{
			WebElement ele= allopt.get(i);
			String text=ele.getText();
			aI.add(text);
		}
		Collections.sort(aI);
		for(String text:aI)
		{
			System.out.println(text);
		}
		driver.quit();
	}
	}
