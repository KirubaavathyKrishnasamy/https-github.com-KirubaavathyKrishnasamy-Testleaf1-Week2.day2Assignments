package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup(); //driver setup
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");//Launch URL
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));  // Implicit wait
		driver.findElement(By.id("username")).sendKeys("demosalesmanager"); //Login 
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();// click login button
		driver.findElement(By.linkText("CRM/SFA")).click();          //click on CRM/SFA
		driver.findElement(By.linkText("Leads")).click();       //click on Leads
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click(); //click on Find Leads
		driver.findElement(By.xpath("//div[@id='x-form-el-ext-gen248']/input")).sendKeys("Kirubaavathy");
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click(); // Find first lead
		driver.findElement(By.linkText("10908")).click();
		driver.findElement(By.linkText("Edit")).click();      //edit first lead
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("xyz");   //update company name
		driver.findElement(By.className("smallSubmit")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();  //verified updated
		if(text.equals("xyz (10908)"))
				{
			System.out.println("sucessfully verified");
				}
				
			driver.close();	
		
		
		
		
		
		
	}

	
}
