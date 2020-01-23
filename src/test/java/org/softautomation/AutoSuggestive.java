package org.softautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive
{
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "C:\\dir\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.makemytrip.com");
        //driver.findElement(By.xpath("//input[@placeholder='From']")).clear();
        WebElement source = driver.findElement(By.xpath("//input[@placeholder='From']"));
        source.clear();
        source.sendKeys("MUM");
        source.sendKeys(Keys.ENTER);

    }
}
