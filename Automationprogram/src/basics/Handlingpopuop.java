package basics;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingpopuop {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/QSP/Desktop/Nakuri.html");
		File f=new File("./data/Resume.doc");
		String abspath=f.getAbsolutePath();
		driver.findElement(By.id("uploadButton")).sendKeys(abspath);
		}
}
