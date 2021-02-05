package com.devops.dxc.devops;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

@SpringBootTest
public class DevopsSeleniumTests {
    private static WebDriver driver;

    @BeforeAll
    public static void setUp() {
        System.out.println("Iniciando configuración...");
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://localhost:8080/");
        driver.manage().window().maximize();
    }

    @AfterAll
    public static void tearDown() throws InterruptedException {
        driver.quit();
    }

    @Test
    public void impuestos() throws InterruptedException {
        driver.get("http://localhost:8080/");
        driver.manage().window().setSize(new Dimension(860, 643));

        driver.findElement(By.id("ahorroId")).click();
        driver.findElement(By.id("ahorroId")).sendKeys("0");
        driver.findElement(By.id("sueldoId")).click();
        driver.findElement(By.id("sueldoId")).sendKeys("0");
        driver.findElement(By.id("btnSolicitar")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("btnReset")).click();

        driver.findElement(By.id("ahorroId")).click();
        driver.findElement(By.id("ahorroId")).sendKeys("70000000");
        driver.findElement(By.id("sueldoId")).click();
        driver.findElement(By.id("sueldoId")).sendKeys("0");
        driver.findElement(By.id("btnSolicitar")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("btnReset")).click();

        driver.findElement(By.id("ahorroId")).click();
        driver.findElement(By.id("ahorroId")).sendKeys("2000000");
        driver.findElement(By.id("sueldoId")).click();
        driver.findElement(By.id("sueldoId")).sendKeys("0");
        driver.findElement(By.id("btnSolicitar")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("btnReset")).click();

        driver.findElement(By.id("ahorroId")).click();
        driver.findElement(By.id("ahorroId")).sendKeys("900000");
        driver.findElement(By.id("sueldoId")).click();
        driver.findElement(By.id("sueldoId")).sendKeys("0");
        driver.findElement(By.id("btnSolicitar")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("btnReset")).click();

        driver.findElement(By.id("ahorroId")).click();
        driver.findElement(By.id("ahorroId")).sendKeys("15000000");
        driver.findElement(By.id("sueldoId")).click();
        driver.findElement(By.id("sueldoId")).sendKeys("0");
        driver.findElement(By.id("btnSolicitar")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("btnReset")).click();

        driver.findElement(By.id("ahorroId")).click();
        driver.findElement(By.id("ahorroId")).sendKeys("5000000");
        driver.findElement(By.id("sueldoId")).click();
        driver.findElement(By.id("sueldoId")).sendKeys("450000");
        driver.findElement(By.id("btnSolicitar")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("btnReset")).click();

        driver.findElement(By.id("ahorroId")).click();
        driver.findElement(By.id("ahorroId")).sendKeys("50000000");
        driver.findElement(By.id("sueldoId")).click();
        driver.findElement(By.id("sueldoId")).sendKeys("1200000");
        driver.findElement(By.id("btnSolicitar")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("btnReset")).click();

        driver.findElement(By.id("ahorroId")).click();
        driver.findElement(By.id("ahorroId")).sendKeys("50000000");
        driver.findElement(By.id("sueldoId")).click();
        driver.findElement(By.id("sueldoId")).sendKeys("1700000");
        driver.findElement(By.id("btnSolicitar")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("btnReset")).click();

        driver.findElement(By.id("ahorroId")).click();
        driver.findElement(By.id("ahorroId")).sendKeys("50000000");
        driver.findElement(By.id("sueldoId")).click();
        driver.findElement(By.id("sueldoId")).sendKeys("2500000");
        driver.findElement(By.id("btnSolicitar")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("btnReset")).click();

        driver.findElement(By.id("ahorroId")).click();
        driver.findElement(By.id("ahorroId")).sendKeys("50000000");
        driver.findElement(By.id("sueldoId")).click();
        driver.findElement(By.id("sueldoId")).sendKeys("4200000");
        driver.findElement(By.id("btnSolicitar")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("btnReset")).click();

        driver.findElement(By.id("ahorroId")).click();
        driver.findElement(By.id("ahorroId")).sendKeys("50000000");
        driver.findElement(By.id("sueldoId")).click();
        driver.findElement(By.id("sueldoId")).sendKeys("4700000");
        driver.findElement(By.id("btnSolicitar")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("btnReset")).click();

        driver.findElement(By.id("ahorroId")).click();
        driver.findElement(By.id("ahorroId")).sendKeys("50000000");
        driver.findElement(By.id("sueldoId")).click();
        driver.findElement(By.id("sueldoId")).sendKeys("6500000");
        driver.findElement(By.id("btnSolicitar")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("btnReset")).click();
    }
}
