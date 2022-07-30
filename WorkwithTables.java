package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkwithTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Refer to http://www.leafground.com/pages/table.html for assignment details.

			// Setup WebDriverManager
			WebDriverManager.chromedriver().setup();

			// Create the chromedriver object named driver
			ChromeDriver driver = new ChromeDriver();

			// Launch the LeafGround Tables HTML page
			driver.get("http://www.leafground.com/pages/table.html");

			// Maximize the window
			driver.manage().window().maximize();

			// Get the count of number of columns
			WebElement tableRow = driver.findElement(By.xpath("//section[@class='innerblock']//tbody/tr[2]"));
			java.util.List<WebElement> column = tableRow.findElements(By.tagName("td"));
			System.out.println("There are "+column.size()+" columns in the table.");

			// Get the count of number of rows
			WebElement table = driver.findElement(By.xpath("//section[@class='innerblock']//tbody"));
			java.util.List<WebElement> row = table.findElements(By.tagName("tr"));
			System.out.println("There are "+row.size()+" rows in the table including the Header.");

			// Get the progress value of 'Learn to interact with Elements'
			for (int i = 3; i<=5; i++)
			{
				String text = driver.findElement(By.xpath("//section[@class='innerblock']//tbody/tr["+i+"]/td[2]")).getText();
				System.out.println("Progress value of 'Learn to interact with Elements' in Row["+i+"]-> "+text);
			}

			// Check the vital task for the least completed progress.
			driver.findElement(By.xpath("//section[@class='innerblock']//tbody/tr[6]/td[3]")).click();
			System.out.println("Checked the vital with least completed progress.");
	}

}
