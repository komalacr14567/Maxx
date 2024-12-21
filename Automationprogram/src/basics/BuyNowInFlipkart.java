package basics;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BuyNowInFlipkart {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("Iphone 16pro maax"+Keys.ENTER);
		driver.findElement(By.xpath("//div[contains(text(),'Apple iphone 16")])[1]")).click();"
		Set<String> allwid=driver.getWindowHandles();
		for(String wid: allwid) {
			driver.switchTo();
			}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//[button[text()='Buy Now]")).click()
	}

}
