package org.softautomation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.concurrent.TimeUnit;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\dir\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
       // driver.manage().window().maximize();
      //
        driver.get("http://facebook.com");

        //System.out.println(driver.getTitle());
       // System.out.println(driver.getCurrentUrl());
        //System.out.println(driver.getPageSource());
        driver.findElement(By.id("email")).sendKeys("azannqureshi34@yahoo.com");
        driver.findElement(By.name("pass")).sendKeys("123456789");
        driver.findElement(By.linkText("Forgotten account?")).click();
      //  driver.close();
       //driver.quit();


    }

}
