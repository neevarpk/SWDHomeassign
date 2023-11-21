package week5.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import org.openqa.selenium.By;




public class CreateLead {

	
	@Test
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("NothinG");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Praveen");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("kumar K");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("708969");
		driver.findElement(By.name("submitButton")).click();
		driver.close();
}
}






