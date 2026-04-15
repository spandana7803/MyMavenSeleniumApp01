package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class App 
{
    public static void main(String[] args) 
    {
        // Set Chrome options for headless execution (Jenkins)
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");              // Run without GUI
        options.addArguments("--no-sandbox");            // Required for Jenkins/Linux
        options.addArguments("--disable-dev-shm-usage"); // Overcome limited resource problems

        // Initialize WebDriver with options
        WebDriver driver = new ChromeDriver(options);

        try {
            // Open website
            driver.get("https://www.saucedemo.com/");
            driver.manage().window().maximize();

            // Enter username
            driver.findElement(By.id("user-name"))
                  .sendKeys("standard_user");

            // Enter password
            driver.findElement(By.id("password"))
                  .sendKeys("secret_sauce");

            // Click login button
            driver.findElement(By.id("login-button")).click();

            // Wait for a few seconds (just to observe execution)
            Thread.sleep(3000);

            System.out.println("Login Successful ✅");

        } catch (Exception e) {
            System.out.println("Error occurred ❌");
            e.printStackTrace();
        } finally {
            // Close browser
            driver.quit();
        }
    }
}
