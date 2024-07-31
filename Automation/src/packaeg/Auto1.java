package packaeg;






import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.By;
public class Auto1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\New folder (2)\\chromedriver-win32\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		Thread.sleep(5000);
		//click on create new account button
		//driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.partialLinkText("Create new")).click();
		
        Thread.sleep(5000);
        
        //Fill 1st name
        driver.findElement(By.name("firstname")).sendKeys("Sagar");
        Thread.sleep(5000);
        
        //Fill Lastname
        driver.findElement(By.name("lastname")).sendKeys("Karad");
        
        //select date from dropdown
        
        Select day= new Select(driver.findElement(By.id("day")));
        day.selectByValue("4");
        Thread.sleep(5000);
        
        //select month
        Select month= new Select(driver.findElement(By.name("birthday_month")));
       // month.selectByIndex(5);
        month.selectByVisibleText("Jun");
        Thread.sleep(5000);
        
        
        
        
      //to quit entire session and driver.close() to close browser
      		driver.quit();
      		
        
	
	
		
		

	}

}
