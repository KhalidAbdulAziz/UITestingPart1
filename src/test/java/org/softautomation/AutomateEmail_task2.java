package org.softautomation;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AutomateEmail_task2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\dir\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://gmail.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement usrname = driver.findElement(By.id("identifierId"));
        usrname.sendKeys("softa503@gmail.com");
        driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();

        WebElement pwd = driver.findElement(By.name("password"));
        pwd.sendKeys("look123xyz");

        driver.findElement(By.xpath("//div[@id='passwordNext']//span[@class='CwaK9']")).click();

        driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']")).click();

        WebElement emailto = driver.findElement(By.name("to"));
        emailto.sendKeys("mkhalid3536@gmail.com");
        WebElement sub = driver.findElement(By.name("subjectbox"));
        sub.sendKeys("Automation Engineer");
        WebElement textbox = driver.findElement(By.id(":9u"));
        textbox.sendKeys("Firt Email");
        driver.findElement(By.id(":8f")).click();
        driver.findElement(By.className("J-Ke n0")).click();

        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.close();

    }
}
