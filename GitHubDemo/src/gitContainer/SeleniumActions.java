package gitContainer;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumActions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Shital\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		/*driver.get("https://www.seleniumhq.org/");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)");
		Thread.sleep(2000);
		driver.close();*/
		
		//to create alert
		/*JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("alert('Create Alert')");
		*/

		
		/*driver.get("http://demowebshop.tricentis.com");
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.id("Email")).sendKeys("1john@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("john1dmello");
		driver.findElement(By.cssSelector("input.button-1.login-button")).click();
		WebElement search = driver.findElement(By.id("small-searchterms"));
		Actions action = new Actions(driver);
		action.keyDown(search, Keys.SHIFT).sendKeys("computer").keyUp(Keys.SHIFT).build().perform();
		action.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();;
		action.moveToElement(driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[2]/a"))).moveToElement(driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[2]/ul/li[2]/a"))).click().build().perform();
		
		*/
		
		
		/*driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div[1]/div/form/div/div[6]/div[1]/input")).click();;
		Alert alert = driver.switchTo().alert();
		String alertMessage = alert.getText();
		System.out.println("Alert Message----" + alertMessage);
		alert.dismiss();*/
		
		driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
		Actions action = new Actions(driver);
		action.dragAndDrop(driver.findElement(By.id("draggable")),driver.findElement(By.id("droppable"))).build().perform();;
		
	}

}
