package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Learngetoptions {
	public static void main(String[]args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///c:/users/QSP/Desktop/Multi_Select%q20dropdown.html");
		WebElement lang=driver.findElement(By.id("lang"));
		Select s=new Select(lang);
		List<WebElement>allselEle=s.getAllSelectedOptions();
		for(int i=0;i<allselEle.size();i++)
		{
			WebElement element=allselEle.get(i);
			String text=element.getText();
		}
		  System.out.println(text);
		  WebElement ele=s.getOptions();
		  System.out.println(ele.getText());
		  List<WebElement>alElem=s.getOptions();
		  for(WebElement ele1:allelem)
		  {
			  System.out.println(ele1.getText());
	     }
		}
	}
