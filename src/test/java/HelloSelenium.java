import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloSelenium
{
	WebDriver driver;

	@Test
	public void openHomePage()
	{
		driver = new ChromeDriver();
		driver.get("https://one-shore.com");
		System.out.println(driver.getTitle());
		driver.quit();
	}
}
