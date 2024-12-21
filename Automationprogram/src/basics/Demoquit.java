package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoquit {
	public static void main(String[]args)throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().minimize();
		driver.manage().window().maximize();
		driver.quit();
	}
}
