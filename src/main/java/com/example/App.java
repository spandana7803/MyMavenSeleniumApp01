package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class App {

    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-gpu");

        WebDriver driver = new ChromeDriver(options);

        // SauceDemo
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        driver.findElement(By.id("user-name"))
              .sendKeys("standard_user");

        driver.findElement(By.id("password"))
              .sendKeys("secret_sauce");

        driver.findElement(By.id("login-button"))
              .click();

        Thread.sleep(5000);

        // Practice Test Automation
        driver.get("https://practicetestautomation.com/practice-test-login/");

        driver.findElement(By.id("username"))
              .sendKeys("student");

        driver.findElement(By.id("password"))
              .sendKeys("Password123");

        driver.findElement(By.id("submit"))
              .click();

        Thread.sleep(5000);

        System.out.println("Automation Successful");

        driver.quit();
    }
}
