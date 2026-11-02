package ScrollingDownDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uploadingfile {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php?utm_source=chatgpt.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\java\\SYNCOMT3004.pptx");
		
		if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("SYNCOMT3004.pptx"))
		{
			System.out.println("the file are uploaded successfully ");
			
		}
		else 
		{
			System.out.println("file are not uploaded ");
			
		}
		driver.close();
	}

}
