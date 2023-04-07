package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestBrowsers {

	public static void main(String[] args) {
	/*
	 * 	System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Ranu documents\\Selenium\\Applications\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		*/
		//== compares memory addresses
		String str = "a201b2c3#$*";
		str = str.replaceAll("[a-z]","");
		str = str.replaceAll("[0-9]","");
		/*
		  for (int i=0; i<str.length(); i++) {
		 
		
			if(str.charAt(i) =='1' || str.charAt(i) =='2' || str.charAt(i)=='3' || str.charAt(i)=='4'  || str.charAt(i)=='5'  
					|| str.charAt(i)=='6'  || str.charAt(i)=='7'  || str.charAt(i)=='8'  || str.charAt(i)=='9'  || str.charAt(i)=='0'  ) {
				str = str.substring(0, i) + str.substring(i+1);
			}
		}
	*/
		System.out.println(str);
	}
}
