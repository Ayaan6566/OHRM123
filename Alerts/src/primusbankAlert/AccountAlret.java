package primusbankAlert;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountAlret {

	public static void main(String[] args)   {
System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://webapp.qedgetech.com");
		
		driver.findElement(By.id("btnreset")).click();
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("master");
		driver.findElement(By.id("btnsubmit")).click();
		
		driver.findElement(By.id("mci_Administrator")).click();
		driver.findElement(By.id("mi_users")).click();
		
//		driver.findElement(By.xpath("//a[contains(@class,'btn btn-default ewAddEdit')]")).click();
//		
//		driver.findElement(By.id("x_Username")).sendKeys("shobha");
//		driver.findElement(By.id("x_Password")).sendKeys("tulasi123!@#");
//		driver.findElement(By.id("x_First_Name")).sendKeys("tulasi");
//		driver.findElement(By.id("x_Last_Name")).sendKeys("yenugula");
//		driver.findElement(By.id("x__Email")).sendKeys("yenugulatulasi@gmail.com");
//	
//		Select ul= new Select(driver.findElement(By.id("x_User_Level")));
//		ul.selectByIndex(1);
//		
//		Select ad = new Select(driver.findElement(By.id("x_Activated")));
//		ad.selectByIndex(2);
//		
//		driver.findElement(By.id("btnAction")).click();
//		driver.findElement(By.xpath("//button[text()='OK!']")).click();
//		driver.findElement(By.xpath("//button[text()='OK']")).click();
//		
		
		
		driver.findElement(By.xpath("//button[contains(@class,'btn btn-default ewSearch')]")).click();
		driver.findElement(By.id("psearch")).sendKeys("srinivas");
		
    	driver.findElement(By.xpath("//div[1]/div[1]/div[1]/div[1]/button[1]")).click();
		driver.findElement(By.xpath(" //a[contains(text(),'Exact match')]")).click();
		driver.findElement(By.id("btnsubmit")).click();
		
		
		
			
			}
	}



