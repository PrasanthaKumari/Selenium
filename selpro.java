package pack;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class selpro
{
	public static void main(String args[])
	{
		System.setProperty("Webdriver.chrome.driver","D:\\Elyazer\\Prasantha\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	}
}


