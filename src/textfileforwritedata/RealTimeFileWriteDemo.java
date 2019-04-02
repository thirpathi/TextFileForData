package textfileforwritedata;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RealTimeFileWriteDemo {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		

		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().deleteAllCookies();
		d.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		d.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		d.get("http://www.flipkart.com");

		// mouse move to element in a page
		WebElement eletronics = d.findElement(By.xpath("//span[text()='Electronics']"));
		Actions a = new Actions(d);
		a.moveToElement(eletronics).build().perform();
		String eletronicstext = eletronics.getText();
		

		File f = new File("D:\\rameshsoft\\workspace\\1TextFileForData\\src\\textfileforwritedata\\abc123.txt");

		boolean b = f.createNewFile();
		if (b)
			System.out.println("File is created");
		else
			System.out.println("File is exists!");

		FileWriter fw = new FileWriter(f, true);
		BufferedWriter bw = new BufferedWriter(fw);

		bw.write(eletronicstext);
		bw.flush();    

	}
	

}



/* ok
o/p:--
File is created
*/