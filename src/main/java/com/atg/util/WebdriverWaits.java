package com.atg.util;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverWaits extends WebBase {

  public static WebDriverWait webDriverWait() {

    return new WebDriverWait(driver, 60);
  }

  public static WebElement visibilityOfelement(WebElement element) {

    webDriverWait().until(ExpectedConditions.visibilityOf(element));

    return element;

  }

  public static WebElement isElementClickable(WebElement element) {
    webDriverWait().until(ExpectedConditions.elementToBeClickable(element));
    return element;

  }

  public static boolean isAlertPresent() {

    boolean alertFound = false;
    try {
      webDriverWait().until(ExpectedConditions.alertIsPresent());
      alertFound = true;
    }
    catch (NoAlertPresentException e) {
      alertFound = false;
    }

    return alertFound;
  }

}
