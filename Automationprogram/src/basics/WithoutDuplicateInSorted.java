package basics;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WithoutDuplicateInSorted {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Lenovo/Desktop/Demo.html");
		WebElement city=driver.findElement(By.id("city"));
		Select s=new Select(city);
		Set<String> ts=new TreeSet<String>();
		List<WebElement> allopt=s.getOptions();
		for(int i=0;i<allopt.size();i++)
		{
			WebElement ele=allopt.get(i);
			String text=ele.getText();
			ts.add(text);
		}
		for(String text:ts) {
			System.out.println(text);
		}
		driver.quit();
	 }
	}


