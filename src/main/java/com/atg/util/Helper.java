package com.atg.util;

import java.time.LocalDate;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Helper extends WebBase{
	
	public static Actions action;
	
	public Helper() {
		action=new Actions(driver);
	}
	
	public static void acceptPopOver() {
		driver.switchTo().alert().accept();
	}

	
	public static void clickElementByJS(WebElement element) {
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", element);
		
	}
	
	public static void clicButtonByAction(WebElement element) {
		action.moveToElement(element).click().build().perform();
	}
	
	
	public static void performDoubleClick(WebElement element) {
		action.moveToElement(element).doubleClick().perform();
	}
	
	public static String generateRandomString(String name) {
	    Random rand=new Random();
	    StringBuilder res=new StringBuilder();
	    for (int i = 0; i < 8; i++) {
	       int randIndex=rand.nextInt(name.length()); 
	       res.append(name.charAt(randIndex));            
	    }
	    return res.toString();
	    }
	
	public static String generateRandomDate() {
		
		
		
		LocalDate startDate = LocalDate.of(1990, 1, 1); 
	    long start = startDate.toEpochDay();
	    

	    LocalDate endDate = LocalDate.now(); 
	    long end = endDate.toEpochDay();
	    

	    long randomEpochDay = ThreadLocalRandom.current().longs(start, end).findAny().getAsLong();
	    System.out.println(LocalDate.ofEpochDay(randomEpochDay));
	    return LocalDate.ofEpochDay(randomEpochDay).toString();
	}
	
	public static String generateRandomEmail(int length) {
		
	    String allowedChars = "abcdefghijklmnopqrstuvwxyz" + "1234567890" + "_-.";
	    String email = null;
	    String temp = RandomStringUtils.random(length, allowedChars);
	    email = temp.substring(0, temp.length() - 9) + "@testdata.com";
	    return email;
	}
	
	
	
}