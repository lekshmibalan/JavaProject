package mavenproject1;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ImplicitWait {
	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //implicit

driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
driver.manage().window().maximize();

driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");

}
}