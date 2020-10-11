package ruchirg.org.midsem;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Lanclass implements LanInterface{
	public String Lan() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\satya\\Downloads\\geckodriver-v0.27.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.lancome.com.au/");
		//delete cookies
		driver.manage().deleteAllCookies();
        //delete cookies end
		//search input
		driver.findElement(By.xpath("//*[@id=\"icon-search-desktop\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"q\"]")).sendKeys("MakeUp");
		//click on search icon
		driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div/div/div[3]/div[1]/form/fieldset/button")).click();
        //select the first product	
		//scroll
		JavascriptExecutor js = (JavascriptExecutor)driver;  
		 js.executeScript("window.scrollBy(0,350)", "");
		//scroll-end
		 //select the size
		 driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div/div[5]/div[1]/div[3]/div/h3/a/span")).click();
		 JavascriptExecutor jsq = (JavascriptExecutor)driver;  
		 jsq.executeScript("window.scrollBy(0,350)", "");
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//*[@id=\"yie-close-button-f666b8e6-4fc1-5d9c-b898-2877f0c722ec\"]")).click();
		 Thread.sleep(2000);
		 Select drp = new Select(driver.findElement(By.xpath("//*[@id=\"quantitySelectBoxItText\"]")));
		 drp.selectByVisibleText("02");

		 driver.findElement(By.xpath("")).click();
		 
		 JavascriptExecutor jse;
		jse = (JavascriptExecutor) driver;
		jse.executeScript("alert('Checkout was Successfull')");
		String ac=driver.switchTo().alert().getText();
		return ac;
	}

}


