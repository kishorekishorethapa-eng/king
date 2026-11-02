package Slider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchtab {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/?utm_source=chatgpt.com");
		
		//driver.switchTo().newWindow(WindowType.TAB);
		                                            
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		
		driver.get("https://demoqa.com/?utm_source=chatgpt.com");
	}

}
