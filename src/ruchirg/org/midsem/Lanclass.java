package ruchirg.org.midsem;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Lanclass implements LanInterface{
	public String Lan() {
		try {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Ruchir\\Downloads\\geckodriver-v0.27.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.lancome.com.au/");
		driver.manage().deleteAllCookies();
		driver.findElement(By.xpath("//*[@id=\"icon-search-desktop\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"q\"]")).sendKeys("MakeUp");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div/div/div[3]/div[1]/form/fieldset/button")).click();
		JavascriptExecutor js = (JavascriptExecutor)driver;  
		 js.executeScript("window.scrollBy(0,350)", "");
		 driver.findElement(By.xpath("//*[@id=\"d431c307c384e5dc6a3e62a2e6\"]/h3/a")).click();
		 JavascriptExecutor jsq = (JavascriptExecutor)driver;  
		 jsq.executeScript("window.scrollBy(0,350)", "");
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//*[@id=\"yie-close-button-f666b8e6-4fc1-5d9c-b898-2877f0c722ec\"]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[1]/div/div[4]/div[2]/div[1]/ul/li[1]/div[2]/div/div/div/div/div[13]/a/img")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[1]/div/div[4]/div[2]/div[2]/form/div[6]/div[1]/div[2]/button")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/div[17]/div/div/div/div[1]/div[2]")).click();
		 driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[1]/div[1]/div/div/form/fieldset/button")).click();
		 driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[1]/div[2]/div[1]/div/div[1]/div[2]/div/div/div[1]/div[2]/div[2]/div")).click();
		 Thread.sleep(3000);
		 jsq.executeScript("window.scrollBy(0,350)", "");
		 driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[1]/div[2]/div[1]/div/div[2]/div[2]/div[2]/button")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.className("textinput f_email input-group-field  required required")).sendKeys("ruchir");
		 driver.findElement(By.xpath("//*[@id=\"dwfrm_singleshipping_shippingAddress_addressFields_firstName\"]")).sendKeys("ruchir");
		 driver.findElement(By.xpath("//*[@id=\"dwfrm_singleshipping_shippingAddress_addressFields_lastName\"]")).sendKeys("ruchir");
		 driver.findElement(By.xpath("//*[@id=\"dwfrm_singleshipping_shippingAddress_addressFields_addressSuggestion\"]")).sendKeys("ruchir");
			Thread.sleep(2000);
	    JavascriptExecutor jse;
		jse = (JavascriptExecutor) driver;
		jse.executeScript("alert('Checkout was Successfull')");
		String ac=driver.switchTo().alert().getText();
		return ac;
		 } 
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return null;
	}

}


