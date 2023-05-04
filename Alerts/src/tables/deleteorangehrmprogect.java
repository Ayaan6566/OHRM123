package tables;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class deleteorangehrmprogect {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			
	WebDriver driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://orangehrm.qedgetech.com");
            
            
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
	driver.findElement(By.id("btnLogin")).click();
	
	driver.findElement(By.linkText("PIM")).click();
	driver.findElement(By.linkText("Employee List")).click();
	
	driver.findElement(By.id("empsearch_id")).sendKeys("12ram");
	driver.findElement(By.id("searchBtn")).click();
	
	String name = "12ram";
	WebElement orgtable ;
	
	orgtable = driver.findElement(By.id("resultTable"));
	List<WebElement> rows, cols ;
	
	rows=orgtable.findElements(By.tagName("tr"));
	for(int i=1; i<rows.size();i++) 
	{
		cols=rows.get(i).findElements(By.tagName("td"));
		if(cols.get(2).getText().equals(name)) 
		{
			driver.findElement(By.id("ohrmList_chkSelectRecord_19285")).click();
			driver.findElement(By.id("btnDelete")).click();
			
			driver.findElement(By.id("dialogDeleteBtn")).click();
			
		}
	}
            	
	}

}
