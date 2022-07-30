package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//download driver and set path
		//Launch Chrome Browser
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		//Launch URL
		driver.get("https://en-gb.facebook.com/");
		
		// Maximize window
		
		driver.manage().window().maximize();
		
		 //implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// Click on create new account button
		
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		
		// Enter First Name
		driver.findElement(By.xpath("//form[@name='reg']/div/div/div/div/div/input")).sendKeys("Kiruba");
		
		// Enter Last Name
		driver.findElement(By.xpath("//div[@class='mbm _1iy_ _a4y rfloat _ohf']/div/div/input")).sendKeys("Krishnasamy");
		
		//Enter Mobile Number
		driver.findElement(By.name("reg_email__")).sendKeys("1234567890");
		
		//Enter Password
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("abcdefg123");
		
		//handle drop downs
		WebElement dropdown1 = driver.findElement(By.id("day"));
		Select select = new Select(dropdown1);
		select.selectByVisibleText("9");
		
		driver.findElement(By.xpath("//select[@name='birthday_month']")).click();
		WebElement dropdown2 = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select sel = new Select(dropdown2);
		sel.selectByVisibleText("Mar");
		
		driver.findElement(By.xpath("//select[@name='birthday_year']")).click();
		WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select year1 = new Select(year);
		year1.selectByValue("1994");
		
		//Radio Button
		
		driver.findElement(By.className("_58mt")).click();
		
		//Sign up
		driver.findElement(By.xpath("//button[@class='_6j mvm _6wk _6wl _58mi _3ma _6o _6v']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
