package org.softautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicDropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\dir\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.spicejet.com");
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='BLR']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='CCU']")).click();


        //driver.findElement(By.xpath("(//a[@value='CCU'])[2]")).click();  //arrays
        //driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='CCU']")).click();
     //   WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
      //  wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ctl00_mainContent_ddl_destinationStation1")));

       // driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1")).click();
        //driver.findElement(By.xpath("//a[contains(text(),'Chennai (MAA)')]")).click();

//        driver.findElement(By.xpath("//a[@value='MAA']")).click();
        //driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
        //driver.findElement(By.xpath("//li[contains(@class,'city_selected')]//a[contains(text(),'Chennai (MAA)')]")).click();
         //driver.findElement(By.xpath("//a[@value='Bengaluru (BLR)']")).click();
        //driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
        // driver.findElement(By.xpath("//a[@value='Chennai (MAA)']")).click();

    }
}
