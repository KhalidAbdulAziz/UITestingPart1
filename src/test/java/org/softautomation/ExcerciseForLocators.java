package org.softautomation;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class ExcerciseForLocators {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\dir\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
       driver.get("https://rahulshettyacademy.com/AutomationPractice/");
      /*  driver.findElement(By.id("checkBoxOption1")).click();
        driver.findElement(By.id("checkBoxOption2")).click();
        driver.findElement(By.id("checkBoxOption3")).click();
        //System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size())
      Thread.sleep(2000);
        driver.findElement(By.id("checkBoxOption1")).click();
        driver.findElement(By.id("checkBoxOption2")).click();
        driver.findElement(By.id("checkBoxOption3")).click();*/
      WebElement check = driver.findElement(By.id("checkBoxOption1"));

        Thread.sleep(2000);

//To Verify the check box is unchecked

        Assert.assertFalse(check.isSelected());

        check.click();

//To verify the check box is checked

        Assert.assertTrue(check.isSelected());

        check.click();

//To verify the check box is unchecked

        Assert.assertFalse(check.isSelected());








    }
}


