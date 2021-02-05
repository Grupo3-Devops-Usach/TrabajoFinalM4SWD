package com.devops.dxc.devops;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

@SpringBootTest
public class DevopsSeleniumTests {
    private static WebDriver driver;

    @BeforeAll
    public static void setUp(){
        System.out.println("Iniciando configuración...");
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://localhost:8080/");
        driver.manage().window().maximize();
    }

    @AfterAll
    public static void tearDown() throws InterruptedException {
        driver.quit();
    }

    @Test
    public void inicial() throws InterruptedException {
        driver.findElement(By.id("ahorroId")).click();
        driver.findElement(By.id("ahorroId")).sendKeys("46000000");
        Thread.sleep(2000);
        driver.findElement(By.id("sueldoId")).click();
        driver.findElement(By.id("sueldoId")).sendKeys("1700000");
        driver.findElement(By.id("btnSolicitar")).click();
        Thread.sleep(2000);
    }
}
