package demo;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PlaceOrder {

	public static void main(String[] args) throws InterruptedException {

		String path= System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",path+"/target/Driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("ipad");
		Actions a=new Actions(driver);
		a.sendKeys(Keys.ARROW_DOWN).build().perform();
		a.sendKeys(Keys.ARROW_DOWN).build().perform();
		a.sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[1]/div[1]/div/div/img")).click();
		Thread.sleep(3000);
		Set<String> window=driver.getWindowHandles();
		Iterator<String> wind=window.iterator();
		String w1=wind.next();
		String w2=wind.next();
		driver.switchTo().window(w2);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA ihZ75k _3AWRsL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("7387308113");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		// Note:- Step No.4 Not included since it was not preset at web web page. Step No. 7 not done since it is asking for otp for login. 
		driver.quit();

	}

}
