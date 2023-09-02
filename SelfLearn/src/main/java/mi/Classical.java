package mi;

import org.openqa.selenium.edge.EdgeDriver;

public class Classical {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.edgedriver.driver","C:\\BrowserDrivers\\edgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://qa-mvp.hydrogenpay.com");
	}

}
