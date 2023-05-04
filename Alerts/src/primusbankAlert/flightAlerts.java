package primusbankAlert;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class flightAlerts {

	public static void main(String[] args) {
		
		
   System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://flights.qedgetech.com");		
		driver.findElement(By.name("email")).sendKeys("yenugulatulasi@gmail.com");
		driver.findElement(By.name("password")).sendKeys("6566");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.linkText("Flight Bookings")).click();
		
		String orderno = "2486";
		
		WebElement orderstable;
		orderstable = driver.findElement(By.className("flights_table"));
		
		List<WebElement> rows,cols;
		
		rows = orderstable.findElements(By.tagName("tr"));
		
		for(int i=1;i<rows.size();i++)
		{
			cols = rows.get(i).findElements(By.tagName("td"));
			if(cols.get(0).getText().equals(orderno))
			{
				cols.get(9).findElement(By.linkText("Delete")).click();
				
				WebDriverWait wait = new WebDriverWait(driver, 10);
				wait.until(ExpectedConditions.alertIsPresent());
				
				String alertmsg =  driver.switchTo().alert().getText();
				if(alertmsg.contains("Delete"))
				{
					driver.switchTo().alert().accept();
					break;
				}else
				{
					driver.switchTo().alert().dismiss();
				}
			}}}}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	