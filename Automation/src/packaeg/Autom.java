package packaeg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeDriver;
class Autom {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\New folder (2)\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		Thread.sleep(5000);
		String pageTitle=driver.getTitle();
		System.out.println(pageTitle);
		Thread.sleep(5000);
		String pageurl=driver.getCurrentUrl();
		System.out.println(pageurl);
		Thread.sleep(5000);
		
		driver.manage().window().minimize();
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//to create new tab
		driver.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(5000);
		
		//to quit entire session and driver.close() to close browser
		driver.quit();
		
	

	}

}
