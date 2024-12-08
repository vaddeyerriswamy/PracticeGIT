package PracticeSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\WorkSpaceOfProjects\\SenleniumNormal\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=LSAmtc__HFY");
		String str=driver.getTitle();
		System.out.println(str);
		System.out.println(str);
		driver.quit();
		System.out.println("swamy");

		System.out.println("vadde");
		System.out.println("yerri");
	}

}
