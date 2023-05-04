package tables;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class deletetableStockAccounting {

	public static void main(String[] args) {
		
		
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
		
		driver.findElement(By.xpath("//button[contains(@class,'btn btn-default ewSearchToggle')]")).click();
		
		driver.findElement(By.id("psearch")).sendKeys("saiee");
		driver.findElement(By.id("btnsubmit")).click();
		
		
		String username ="saiee";
		WebElement stockAccounting ;
		stockAccounting= driver.findElement(By.xpath("//div[@id='gmp_users']"));
		List<WebElement> rows, cols;
		rows= stockAccounting.findElements(By.tagName("tr"));
		for (int i=1;i<rows.size();i++) 
		{
			cols=rows.get(i).findElements(By.tagName("td"));
			
			if(cols.get(2).getText().equals(username)) 
				
			{
//				
//   driver.findElement(By.xpath("//td[1]/div[1]/span[1]/input[1]")).click();
//   driver.findElement(By.xpath("//a[contains(@class,'btn btn-default ewAction ewMultiDelete')]")).click();
//  driver.findElement(By.xpath("//button[text()='OK']")).click();	
//				
		}
		
		
		
	
		
	}}}


