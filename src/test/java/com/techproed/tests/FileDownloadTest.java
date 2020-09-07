package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileDownloadTest extends TestBase {
    @Test
    public void dosyaVarMi(){
        System.out.println(System.getProperty("user.dir"));
        System.out.println(System.getProperty("user.home"));
        ////D:\Java dersleri\Alıştırma-14\TestNGProje
        //C:\Users\zbook

        String kullaniciDosyaYolu =System.getProperty("user.dir");
        String pomXmlDosyaYolu =kullaniciDosyaYolu + "/pom.xml";
        boolean varMi = Files.exists(Paths.get(pomXmlDosyaYolu));
        System.out.println(varMi);

    }
    @Test
    public void dosyaUpload (){
        driver.get("http://the-internet.herokuapp.com/upload");
        WebElement dosyaSecmeButonu = driver.findElement(By.id("file-upload"));

        dosyaSecmeButonu.sendKeys("D:/Java dersleri/Slides/selenium/2.GÜN.pdf");

        WebElement uploadButonu =driver.findElement(By.id("file-submit"));
        uploadButonu.click();

        WebElement fileUploadYazisi = driver.findElement(By.tagName("h3"));

        Assert.assertTrue(fileUploadYazisi.isDisplayed());

    }
    @Test
    public void dosyaDownload(){
        driver.get("http://the-internet.herokuapp.com/download");
        WebElement AmsterdamLinki = driver.findElement(By.partialLinkText("Amsterdam.jpg"));
        AmsterdamLinki.click();

        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        boolean varMi =Files.exists(Paths.get("C:/Users/zbook/Downloads/Amsterdam.jpg"));
    }
}
