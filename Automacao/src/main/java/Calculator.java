import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Calculator {
	
	public static void main (String[] args) throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		
		dc.setCapability("appPackage", "com.android.calculator2");
		dc.setCapability("appActivity", "com.android.calculator2.Calculator");
		
		URL url = new URL("http://127.0.0.1:4724/wd/hub");
		
		AndroidDriver<WebElement> driver= new AndroidDriver<WebElement>(url, dc);
		Thread.sleep(5000);
		
		MobileElement el1 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_7");
		el1.click();
		MobileElement el2 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_8");
		el2.click();
		MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("plus");
		el3.click();
		MobileElement el4 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_3");
		el4.click();
		MobileElement el5 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_9");
		el5.click();
		MobileElement el6 = (MobileElement) driver.findElementByAccessibilityId("equals");
		el6.click();
		
		String results = driver.findElementById("com.android.calculator2:id/result").getText();
		
		if(results.equals("117")) 
			
		{
			System.out.println("O teste passou...");
		}
        
		else
		
		{
			System.out.println("O teste falhou...");
		}
	}

}
