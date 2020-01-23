package org.softautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomizedXpathCssFaceBook {

    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "C:\\dir\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//div[@class='RNNXgb']/div/div[2]/input")).sendKeys("hello!");
        /*driver.get("http://facebook.com");
        driver.findElement(By.xpath("//input[@type='email'] ")).sendKeys("khalidaziz");
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("4321");
        driver.findElement(By.xpath("//input[@value='Log In']")).click();*/

    }
}