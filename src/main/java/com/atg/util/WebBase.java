package com.atg.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebBase extends BaseUtil {

  public static Properties property;

  public WebBase() {
    property = new Properties();
    System.out.println(System.getProperty("user.dir"));
    try {
      FileInputStream filereader = new FileInputStream(
          System.getProperty("user.dir") + File.separator + "src/main/java/com/atg/config/config.properties");
      property.load(filereader);
    }
    catch (FileNotFoundException e) {

      e.getMessage();
    }
    catch (IOException e) {
      e.getMessage();
    }
  }

  public static void initialize() {
    String browserName = property.getProperty("browser");
    System.out.println("browserName: " + browserName);
    if (browserName.equalsIgnoreCase("chrome")) {
      System.setProperty("webdriver.chrome.driver",
          System.getProperty("user.dir") + File.separator + "ChromeDriver/chromedriver");
      driver = new ChromeDriver();
    }
    else if (browserName.equalsIgnoreCase("firefox")) {
      System.setProperty("webdriver.gecko.driver",
          System.getProperty("user.dir") + File.separator + "/FirefoxDriver/geckodriver");
      driver = new FirefoxDriver();
    }

    driver.manage().window().maximize();
    driver.get(property.getProperty("appUrl"));
    driver.findElement(By.id("onetrust-accept-btn-handler")).click();
    driver.manage().timeouts().implicitlyWait(TestUtil.implicitTimeOut, TimeUnit.SECONDS);
    driver.manage().timeouts().pageLoadTimeout(TestUtil.pageLoadTimeOut, TimeUnit.SECONDS);

  }

}
