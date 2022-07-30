package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkWithEditField {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup(); //driver setup
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Edit.html");//Launch URL
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("cbe.kiruba93@gmail.com");
		
		//Append Function
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("hi");
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys(Keys.TAB);
		
		// Get Default Text
		String text = driver.findElement(By.xpath("//input[@value='TestLeaf']")).getAttribute("Value");
		System.out.println(text);
		
		// Clear the Text
		driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
		
		//To verify that Element is Enabled
        Boolean nn =driver.findElement(By.xpath("//input[@disabled='true']")).isEnabled();
  if(nn) {
        System.out.println("Yes ! Element is Present");
  }
  else {
        System.out.println("NO ! Element is not Present");
  }

	}
}
	
		
		
	




	


