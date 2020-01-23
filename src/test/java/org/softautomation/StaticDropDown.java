package org.softautomation;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class StaticDropDown {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\dir\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.spicejet.com");
        Select s = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
        s.selectByValue("USD");
        //s.selectByVisibleText("AED");
        Assert.assertFalse(driver.findElement(By.cssSelector("#ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
        driver.findElement(By.cssSelector("#ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("#ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
        driver.findElement(By.id("divpaxinfo")).click();
        Select adt = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
        adt.selectByValue("1");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        Select ch = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")));
        ch.selectByValue("2");
        Select inf = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant")));
        inf.selectByValue("1");



      /*  Select ad = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
        ad.selectByValue("2");
        Select c = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")));
        c.selectByValue("3");
        Select inf = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant")));
        inf.selectByValue("1");

       */


    }
}
