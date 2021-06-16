package com.atg.stepDefinitions;

import static org.junit.Assert.assertEquals;

import org.apache.log4j.Logger;

import com.atg.pages.HorsePage;
import com.atg.util.LoggerHelper;
import com.atg.util.PageObjectManager;
import com.atg.util.WebBase;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HorseSteps extends WebBase {

  private HorsePage horsePage;
  private PageObjectManager pageObjectManager;
  private Logger log;

  @Given("^the user launch browser and navigates to url ATG.se$")
  public void user_launch_the_chrome_browser() {
    try {
      pageObjectManager = new PageObjectManager();
      log = LoggerHelper.getLogger(LoggerHelper.class);

      log.info("** Launching chrome browser **");
      WebBase.initialize();
    }
    catch (NullPointerException e) {
      throw new RuntimeException(
          e.getMessage() + " WebBase or pageObjectManager object is not loaded in " + Object.class.getName());
    }
  }

  @Then("^user is on ATG - Spel på Sport, Häst och Casino home page$")
  public void user_is_on_atg_page() {

    try {
      horsePage = pageObjectManager.getHorsePageObj();
      assertEquals(horsePage.getPageTitle(), property.getProperty("pageTitle"));
      log.info(" ** Page Title assertion success **");
    }
    catch (NullPointerException e) {
      throw new RuntimeException("Page objects are null");
    }
    catch (AssertionError e) {
      log.info(" ** Page title assertion is failed **");
      throw new RuntimeException(e.getMessage() + " failed due to Page Title Assertion");

    }
  }

  @And("^the user select (.*)$")
  public void user_click_game_type(String gameType) {
    horsePage.selectGameType1(gameType);
  }

  @And("^the user create New Coupon$")
  public void user_create_new_coupon() {
    horsePage.createNewCoupon();
  }

  @Then("^the user mark Horses for game type (.*) and verify race menu$")
  public void user_mark_horses_V4(String gameType) {
    horsePage.markHorses(gameType);
  }

  @Then("^verify race menu and start list rows for the (.*)$")
  public void verify_race_menu(String gameType) {
    horsePage.verifyRaceMenu(gameType);
  }

  @After()
  public void tearoff() {
    driver.close();
  }

}