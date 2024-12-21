package basics;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectanddeselect {
	public static void main(String[]args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///c:/users/qsp");
		WebElement city=driver.findElement(By.id("city"));
		Select s=new Select(city);
		List<WebElement>allEle=s.getOptions();
		int count=allele.size();
		for(int i=0;i<count;i++)
		{
			s.selectByIndex(i);
		}
		for(int i=count-1;i<=0;i--)
		{
			s.deselectByIndex(i);
		}
		for(WebElement ele:allEle)
		{
			String text=ele.getText();
			s.selectByVisibleText(text);
		}
		for(WebElement ele:allEle)
		{
			String value=ele.getAttribute("value");
			s.deselectByValue(value);
			}
		}
	}


