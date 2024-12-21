package basics;

import java.sql.Driver;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CityNameIsPresent {
	private static String cityname;

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the city name");
		String cityname=s.nextLine();
	    WebDriver driver=new ChromeDriver();
	    driver.get("file:///C:/Users/Lenovo/Desktop/Demo.html");
	    WebElement city=driver.findElement(By.id("city"));
	    Select s1=new Select(city);
	    List<WebElement> allopt=s1.getOptions();
	    int count=0;
	    for(WebElement ele:allopt) {
	    	String text=ele.getText();
	    	if(cityname.equalsIgnoreCase(text))
	    	{
	    		count++;
	    		break;
	    		}
	    }
	    if(count==1) {
	    	System.out.println(cityname+"is present in the dropdown");
	    }
	    else {
	    	System.out.println(cityname+"is not present in the dropdown");
	    	}
	    driver.quit();
		}
}
