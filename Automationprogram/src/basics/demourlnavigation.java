package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demourlnavigation {
     public static void main(String[]args) {
    	 WebDriver driver=new ChromeDriver();
    	 driver.get("https://www.seleniumhq.org/");
    	 String URL=driver.getCurrentUrl();
    	 if(URL.equals("https://www.selenium.dev/"))
    	 {
    		 System.out.println("url is navigating successfully and pass");
    	 }
    	 else
    	 {
    		 System.out.println("url is not navigating successfully and fail");
    	 }
    	 driver.quit();
		
	}
		
	}

