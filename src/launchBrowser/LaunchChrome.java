package launchBrowser;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
	
	public static void main(String[] args) throws InterruptedException {
		
	//	Scanner snc =new Scanner(System.in);
		
		//Launch Chrome
		WebDriver driver = new ChromeDriver();
		//Fetch Website
		driver.get("https://www.google.com/");
		//Maximize Browser
		driver.manage().window().maximize();
		//Type Selenium
		driver.findElement(By.name("q")).sendKeys("selenium");
		
		Thread.sleep(3000);
		
		//Close Browser
		driver.close();
	}

}
