package waits;
import org.openqa.selenium.By;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
public class sfdca {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/animbalkar/chromedriver.exe");
		WebDriver d= new ChromeDriver();
		//WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(60));
		d.get("https://usertesting.lightning.force.com/lightning/r/Report/00O6T0000064JLYUA2/view?queryScope=userFolders%5C");
		d.findElement(By.id("idp_section_buttons")).click();
		d.findElement(By.id("okta-signin-username")).sendKeys("animbalkar@usertesting.com");
		d.findElement(By.id("okta-signin-password")).sendKeys("Zapple.apple!1");
		
		d.findElement(By.id("okta-signin-submit")).click();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		d.findElement(By.xpath("//input[contains(@value,'Send Push')]")).click();
		
		try {
			Thread.sleep(30000);
			d.switchTo().frame(0);
			System.out.println("hi");
			d.findElement(By.cssSelector("div#report-main div:nth-child(5) div div button")).click();	
			d.findElement(By.xpath("//span[contains(@title, 'Export')]")).click();	
			
			Thread.sleep(10000);
		
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
	
}
