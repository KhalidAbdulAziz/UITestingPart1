package org.softautomation;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.fetch.model.AuthChallengeResponse;


public class MatchAddress {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\dir\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        WebElement ele = driver.findElement(By.name("q"));
        ele.sendKeys("nisum pakistan address");
        ele.submit();
        Thread.sleep(2000);
        String googleAds = driver.findElement(By.xpath("//span[@class='LrzXr']")).getText();
        String subStr = googleAds.split("Street")[0];
        String actualStr = subStr.replaceAll("# 28-C،","#28-C,");
        //System.out.println(actualStr);
        driver.navigate().back();
        WebElement el2 = driver.findElement(By.name("q"));
        el2.sendKeys("nisum pakistan");
        el2.submit();

        driver.findElement(By.xpath("//h3[contains(text(),'Nisum: Home')]")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,3000)");

        driver.findElement(By.linkText("PAKISTAN")).click();
        Thread.sleep(1000);
     String adds2 =driver.findElement(By.xpath("//span[contains(text(),'Plot #28-C, Jami Commercial Street 2')]")).getText();
        String repStr = adds2.replaceAll("Plot","Building");
        String expStr = repStr.split("Street")[0];
        //System.out.println(expStr);
         Assert.assertEquals(expStr,actualStr);
        System.out.println("successfully passed");


        driver.close();
        driver.quit();
       // Assert.assertEquals(expRes,actualRes);








        //js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        //js.executeScript("arguments[0].scrollIntoView();", Element)
        // driver.manage().window().maximize();
        //
       // driver.get("http://facebook.com");
        //System.out.println(driver.getTitle());
        // System.out.println(driver.getCurrentUrl());
        //System.out.println(driver.getPageSource());
      //  driver.findElement(By.id("email")).sendKeys("azannqureshi34@yahoo.com");
        //driver.findElement(By.name("pass")).sendKeys("123456789");
        //driver.findElement(By.linkText("Forgotten account?")).click();
        //  driver.close();
        //driver.quit();


    }
}
