package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkWithLink {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup(); //driver setup
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Link.html");//Launch URL
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Go to Home Page")).click();
		driver.findElement(By.xpath("//img[@alt='Link']")).click();
		String link = driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).getAttribute("href");
		System.out.println(link);
		driver.findElement(By.linkText("Verify am I broken?")).click();
		String check = driver.getTitle();
		if(check.equals("404 Not Found"))
				{
			System.out.println("broken");
				}
		else
		{
			System.out.println("Not Broken");
		}
		//Go to Home page with same link name
		
		driver.get("http://leafground.com/pages/Link.html");
		driver.findElement(By.xpath("(//a[text()='Go to Home Page'])[2]")).click();
		
		//Count of Links in the page
		driver.get("http://leafground.com/pages/Link.html");
		driver.findElement(By.linkText("How many links are available in this page?")).click();
		WebElement links = driver.findElement(By.xpath("//section[@class='innerblock']"));
		java.util.List<WebElement> linksList = links.findElements(By.tagName("a"));
		System.out.println("The no of Links are "+ linksList.size());
				}

}
