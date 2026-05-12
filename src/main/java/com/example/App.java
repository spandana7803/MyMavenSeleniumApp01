package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        Thread.sleep(5000);

        driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.manage().window().maximize();

        Thread.sleep(5000);

        driver.findElement(By.id("username")).sendKeys("student");

        Thread.sleep(5000);

        driver.findElement(By.id("password")).sendKeys("Password123");

        Thread.sleep(5000);

        driver.findElement(By.id("submit")).click();

        Thread.sleep(5000);

        driver.quit();
    }
}
