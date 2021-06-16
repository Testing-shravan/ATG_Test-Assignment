
package com.atg.pages;

import static org.testng.Assert.assertEquals;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.atg.util.Helper;
import com.atg.util.WebBase;

public class HorsePage extends WebBase {

  @FindBy(xpath = "//a[@testid='header-verticallink-horse']")
  WebElement mHorseOption;

  @FindBy(xpath = "//*[contains(text(),'V4')]")
  WebElement mSelectV4;

  @FindBy(xpath = "//div[@data-test-id='gameType-horse-icon']")
  WebElement mSelectGameType;

  @FindBy(xpath = "//font[contains(text(),'V4')]")
  WebElement mSelectAnotherV4;

  @FindBy(xpath = "//*[contains(text(),'V5')]")
  WebElement mSelectV5;

  @FindBy(xpath = "//button[@data-test-id='new-coupon']")
  WebElement mNewCoupon;

  @FindBy(xpath = "//*[contains(text(),'Tom kupong')]")
  WebElement mConfirmCoupon;

  @FindBy(xpath = "//button[@data-test-id='coupon-button-leg-1-start-1']")
  WebElement mraceTitle1_1;

  @FindBy(xpath = "//button[@data-test-id='coupon-button-leg-1-start-2']")
  WebElement mraceTitle2_1;

  @FindBy(xpath = "//button[@data-test-id='coupon-button-leg-1-start-3']")
  WebElement mraceTitle3_1;

  @FindBy(xpath = "//button[@data-test-id='coupon-button-leg-1-start-4']")
  WebElement mraceTitle4_1;

  @FindBy(xpath = "//button[@data-test-id='coupon-button-leg-2-start-1']")
  WebElement mraceTitle1_2;

  @FindBy(xpath = "//button[@data-test-id='coupon-button-leg-2-start-2']")
  WebElement mraceTitle2_2;

  @FindBy(xpath = "//button[@data-test-id='coupon-button-leg-2-start-3']")
  WebElement mraceTitle3_2;

  @FindBy(xpath = "//button[@data-test-id='coupon-button-leg-3-start-1']")
  WebElement mraceTitle1_3;

  @FindBy(xpath = "//button[@data-test-id='coupon-button-leg-3-start-2']")
  WebElement mraceTitle2_3;

  @FindBy(xpath = "//button[@data-test-id='coupon-button-leg-3-start-3']")
  WebElement mraceTitle3_3;

  @FindBy(xpath = "//button[@data-test-id='coupon-button-leg-4-start-1']")
  WebElement mraceTitle1_4;

  @FindBy(xpath = "//button[@data-test-id='coupon-button-leg-4-start-2']")
  WebElement mraceTitle2_4;

  @FindBy(xpath = "//button[@data-test-id='leg-4-toggle-all']")
  WebElement mallRaceTitle;

  @FindBy(xpath = "//div[@data-test-id='race-0-menu-info']")
  WebElement mraceMenu1;

  @FindBy(xpath = "//div[@data-test-id='race-1-menu-info']")
  WebElement mraceMenu2;

  @FindBy(xpath = "//div[@data-test-id='race-2-menu-info']")
  WebElement mraceMenu3;

  @FindBy(xpath = "//div[@data-test-id='race-3-menu-info']")
  WebElement mraceMenu4;

  @FindBy(xpath = "//button[@data-test-id='startlist-button-leg-1-start-1']")
  WebElement mstartListRow1;

  @FindBy(xpath = "//button[@data-test-id='startlist-button-leg-1-start-2']")
  WebElement mstartListRow2;

  @FindBy(xpath = "//button[@data-test-id='startlist-button-leg-1-start-3']")
  WebElement mstartListRow3;

  @FindBy(xpath = "//button[@data-test-id='startlist-button-leg-1-start-4']")
  WebElement mstartListRow4;

  private Logger log;
  WebDriverWait wait = new WebDriverWait(driver, 30);

  public HorsePage() {
    PageFactory.initElements(driver, this);
  }

  public String getPageTitle() {
    return driver.getTitle();

  }

  public void selectGameType(String gameType) {

    try {

      if (gameType.contains("V4")) {
        wait.until(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'" + gameType + "')]")));
        driver.findElement(By.xpath("//div[contains(text(),'" + gameType + "')]")).click();
      }

      else if (gameType.contains("V5")) {
        wait.until(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'" + gameType + "')]")));
        driver.findElement(By.xpath("//div[contains(text(),'" + gameType + "')]")).click();
      }

      else if (gameType.contains("V65")) {
        wait.until(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'" + gameType + "')]")));
        driver.findElement(By.xpath("//div[contains(text(),'" + gameType + "')]")).click();
      }

      else if (gameType.contains("DD")) {
        wait.until(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'" + gameType + "')]")));
        driver.findElement(By.xpath("//div[contains(text(),'" + gameType + "')]")).click();
      }

    }

    catch (org.openqa.selenium.NoSuchElementException e) {
      log.info("Game type is not available", e);
    }

  }

  public void selectGameType1(String gameType) {

    if (!mSelectGameType.equals(gameType)) {
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'" + gameType + "')]")));
      driver.findElement(By.xpath("//div[contains(text(),'" + gameType + "')]")).click();
    }

    else if (!mSelectGameType.equals(gameType)) {
      clickAvailableGameType();
    }

  }

  public void clickAvailableGameType() {
    driver.findElement(By.xpath("//a[@data-test-id='highlight-content-next']")).click();
    wait.until(
        ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-test-id='calendar-menu-gameType-V5']")))
        .click();
  }

  public void createNewCoupon() {
    Helper.clickElementByJS(mNewCoupon);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Tom kupong')]")))
        .isDisplayed();
    Helper.clickElementByJS(mConfirmCoupon);
  }

  public void markHorses(String gameType) {

    if (gameType.contains("V4")) {

      Helper.clickElementByJS(mraceTitle1_1);
      Helper.clickElementByJS(mraceTitle2_1);
      Helper.clickElementByJS(mraceTitle3_1);
      Helper.clickElementByJS(mraceTitle4_1);

      Helper.clickElementByJS(mraceTitle1_2);

      Helper.clickElementByJS(mraceTitle1_3);
      Helper.clickElementByJS(mraceTitle2_3);

      Helper.clickElementByJS(mallRaceTitle);
      verifyRaceMenu(gameType);

    }

    else if (gameType.contains("V5")) {

      Helper.clickElementByJS(mraceTitle1_1);
      Helper.clickElementByJS(mraceTitle2_1);
      Helper.clickElementByJS(mraceTitle3_1);
      Helper.clickElementByJS(mraceTitle4_1);

      Helper.clickElementByJS(mraceTitle1_2);
      Helper.clickElementByJS(mraceTitle2_2);
      Helper.clickElementByJS(mraceTitle3_2);

      Helper.clickElementByJS(mraceTitle1_3);
      Helper.clickElementByJS(mraceTitle2_3);

      Helper.clickElementByJS(mraceTitle1_4);
      verifyRaceMenu(gameType);

    }

    else if (gameType.contains("V3")) {

      Helper.clickElementByJS(mraceTitle1_1);
      Helper.clickElementByJS(mraceTitle2_1);
      Helper.clickElementByJS(mraceTitle3_1);
      Helper.clickElementByJS(mraceTitle4_1);

      Helper.clickElementByJS(mraceTitle1_2);
      Helper.clickElementByJS(mraceTitle2_2);
      Helper.clickElementByJS(mraceTitle3_2);

      Helper.clickElementByJS(mraceTitle1_3);
      Helper.clickElementByJS(mraceTitle2_3);
      verifyRaceMenu(gameType);

    }

    else if (gameType.contains("V65")) {

      Helper.clickElementByJS(mraceTitle1_1);
      Helper.clickElementByJS(mraceTitle2_1);
      Helper.clickElementByJS(mraceTitle3_1);
      Helper.clickElementByJS(mraceTitle4_1);

      Helper.clickElementByJS(mraceTitle1_2);
      Helper.clickElementByJS(mraceTitle2_2);
      Helper.clickElementByJS(mraceTitle3_2);

      Helper.clickElementByJS(mraceTitle1_3);
      Helper.clickElementByJS(mraceTitle2_3);

      Helper.clickElementByJS(mallRaceTitle);
      verifyRaceMenu(gameType);

    }

    else if (gameType.contains("DD")) {

      Helper.clickElementByJS(mraceTitle1_1);
      Helper.clickElementByJS(mraceTitle2_1);
      Helper.clickElementByJS(mraceTitle3_1);
      Helper.clickElementByJS(mraceTitle4_1);

      Helper.clickElementByJS(mraceTitle1_2);
      Helper.clickElementByJS(mraceTitle2_2);
      Helper.clickElementByJS(mraceTitle3_2);
      verifyRaceMenu(gameType);

    }

  }

  public void verifyRaceMenu(String gameType) {

    int raceMenu1 = Integer.parseInt(mraceMenu1.getAttribute("innerHTML"));
    int raceMenu2 = Integer.parseInt(mraceMenu2.getAttribute("innerHTML"));
    int raceMenu3 = Integer.parseInt(mraceMenu3.getAttribute("innerHTML"));
    int raceMenu4 = Integer.parseInt(mraceMenu3.getAttribute("innerHTML"));

    if (gameType.equals("V4")) {
      assertEquals(raceMenu1, 4);
      assertEquals(raceMenu2, 1);
      assertEquals(raceMenu3, 2);
    }

    else if (gameType.contains("V5")) {
      assertEquals(raceMenu1, 4);
      assertEquals(raceMenu2, 3);
      assertEquals(raceMenu3, 2);
      assertEquals(raceMenu4, 1);
    }

    else if (gameType.contains("V65")) {
      assertEquals(raceMenu1, 4);
      assertEquals(raceMenu2, 3);
      assertEquals(raceMenu3, 2);
    }

    else if (gameType.contains("DD")) {
      assertEquals(raceMenu1, 4);
      assertEquals(raceMenu2, 3);
    }

  }
}
