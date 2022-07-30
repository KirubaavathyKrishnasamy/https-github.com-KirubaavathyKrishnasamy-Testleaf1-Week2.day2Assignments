package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkWithButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup(); //driver setup
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Button.html");//Launch URL
		driver.manage().window().maximize();
		
		//Click on Home Button
		
		driver.findElement(By.xpath("//button[@id='home']")).click();
		driver.findElement(By.xpath("//img[@alt='Buttons']")).click();
		
		// Get x and Y position
		 int xvalue =driver.findElement(By.id("position")).getLocation().getX();
		System.out.println(xvalue);
		int yvalue =driver.findElement(By.id("position")).getLocation().getY();
		System.out.println(yvalue);
		
		
	
		
		//Find color of Button
		String colour = driver.findElement(By.xpath("//button[@id='color']")).getCssValue("background-color");
		System.out.println(colour);
				
		//Find height of Button
		int height = driver.findElement(By.xpath("//button[@id='size']")).getSize().getHeight();
		System.out.println("The height is " +height);
		
		
		
		
	}

}
