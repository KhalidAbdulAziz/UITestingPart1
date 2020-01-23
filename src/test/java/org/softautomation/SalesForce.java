package org.softautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForce {

    public static void main(String args[])
    {
        System.setProperty("webdriver.chrome.driver", "C:\\dir\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://login.salesforce.com/");
    //    driver.findElement(By.id("username")).sendKeys("dez123");
       // driver.findElement((By.name("pw"))).sendKeys("4321");
        driver.findElement(By.cssSelector("#username")).sendKeys("uzaifa");
        driver.findElement(By.cssSelector(("#password"))).sendKeys("4321");
      //  driver.findElement(By.name("pw")).sendKeys("4321");
        driver.findElement(By.xpath("//*[@id='Login']")).click();
        System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());


    }
}

