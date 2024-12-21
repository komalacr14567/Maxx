package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		Thread.sleep(2000);
		String title = driver.getTitle();
		Thread.sleep(2000);
	    System.out.println(title);
	    String url = driver.getCurrentUrl();
	    System.out.println(url);
	    driver.navigate().to("https://www.fb.com");
	    Thread.sleep(2000);
	    driver.navigate().back();
	    driver.navigate().forward();
	    driver.navigate().refresh();
	    driver.quit();
	    }
}
