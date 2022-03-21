package com.dx.frontend;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.springframework.core.io.ClassPathResource;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Hooks {
    public static WebDriver driver;
    public static Properties SYSTEM_CONFIG=new Properties();
    static{
    	try {
    		SYSTEM_CONFIG.load(new FileInputStream("config.properties"));  
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @SuppressWarnings("deprecation")
	@Before
    public void openBrowser() {
        System.out.println("Open Browser...");
        if (SYSTEM_CONFIG.getProperty("browser").equals("chrome")) {
        	 System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
             ChromeOptions options = new ChromeOptions();
             driver = new ChromeDriver(options);
		}else{// IE
			 System.setProperty("webdriver.ie.driver", "src/test/resources/driver/IEDriverServer.exe");
             driver = new InternetExplorerDriver();
		}
       
        driver.manage().window().maximize();    // 最大化窗口
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);    // 隐式等待10s
    }

    @SuppressWarnings("deprecation")
	@After
    public void embedScreenshot(Scenario scenario) {
        System.out.println("Close Browser...");
        try {
            byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        } catch (WebDriverException somePlatformsDontSupportScreenshots) {
            System.err.println(somePlatformsDontSupportScreenshots.getMessage());
        }
        driver.quit();
    }
}