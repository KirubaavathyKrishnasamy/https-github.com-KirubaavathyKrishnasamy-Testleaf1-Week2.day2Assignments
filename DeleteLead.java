package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup(); //driver setup
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main"); //Launch URL
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));  // Implicit wait
		driver.findElement(By.id("username")).sendKeys("demosalesmanager"); //Login 
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();// click login button
		driver.findElement(By.linkText("CRM/SFA")).click();          //click on CRM/SFA
		driver.findElement(By.linkText("Leads")).click();       //click on Leads
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click(); //click on Find Leads
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[2]")).click();//Click on phone
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[2]"));
		
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("123456");//Give phone no
		
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click(); //click on find lead
		// Find first lead
		driver.findElement(By.linkText("14625")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();    //Get firstleadID
		System.out.println(text);
		driver.findElement(By.className("subMenuButtonDangerous")).click();   //Delete
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();  //Click find lead 
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys("14625");     //Search for capture ID
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		String Text2 = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();  // Print no record display
		System.out.println(Text2);
		driver.close();     //Close browser
		
		
		
		
	}

}
