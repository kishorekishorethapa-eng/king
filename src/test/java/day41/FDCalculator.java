package day41;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FDCalculator {
	public static  void main(String[] args ) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.paisabazaar.com/fixed-deposit/sbi-fd-calculator/?utm_source=chatgpt.com");
		driver.manage().window().maximize();
		
		String filepath = System.getProperty("user.dir")+"\\testdata\\calculation.xlsx";
		//int row = ExcelUtils.get
	}

}
