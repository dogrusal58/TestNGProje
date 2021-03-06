package com.techproed.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DependsOnMethodsTest {
    WebDriver driver;
    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test(dependsOnMethods = "googleTest")//amazon tedtini google testine bağladık.amazon testini çalıştırsak
    // da öncesinde google testi çalışacak.before methodundan farkı bunu istenilen methoddan önce çalıştırırız.
    public void amazonTest(){
        driver.get("https://amazon.com");
    }
    @Test(dependsOnMethods = "facebookTest")
    public void googleTest(){
        driver.get("https://google.com");
    }
    @Test
    public void facebookTest(){
        driver.get("https://facebook.com");
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
