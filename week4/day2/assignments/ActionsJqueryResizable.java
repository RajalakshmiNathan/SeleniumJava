package week4.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsJqueryResizable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				// TODO Auto-generated method stub
				WebDriverManager.chromedriver().setup();
				//ChromeOptions options = new ChromeOptions();
				//options.addArguments("--disable-notifications");
				ChromeDriver driver = new ChromeDriver();
				driver.get("https://jqueryui.com/resizable");
				driver.manage().window().maximize();
				driver.switchTo().frame(0);
				Actions builder = new Actions(driver);
				WebElement resizableEle = driver.findElement(By.xpath("//h3[text()='Resizable']/following-sibling::div[3]"));
				//WebElement dragEle = driver.findElement(By.xpath("//p[text()='Drag me around']"));
				//builder.dragAndDropBy(dragEle, 150, 190).perform();
				int x = resizableEle.getLocation().getX();
				int y = resizableEle.getLocation().getY();
				int length = resizableEle.getRect().getWidth();
				builder.clickAndHold(resizableEle).moveByOffset(100, 100).perform();		
			}



		
	

}
