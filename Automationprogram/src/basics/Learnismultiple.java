package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Learnismultiple {
	public static void main(String[]args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("files:///c:/users/QSP");
		WebElement dd=driver.findElement(By.id("city"));
		WebElement dd=driver.findElement(By.id("lang"));
		Select s=new Select(dd);
		boolean res=s.isMultiple();
		if(res==true)
		{
			System.out.println("The dropdown is multiselect");
		}
		else {
			System.out.println("The dropdown is singleselect");
			WebElement ele=s.getWrappedElement();
			System.out.println(ele.getText());
			driver.quit()
	  }
	}
}
