package com.techproed.tests;

import com.techproed.pages.GooglePage;
import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class GoogleTest extends TestBase {

        @Test
        public void aramaTesti(){
            driver.get("https://google.com");
            //WebElement aramaKutusu = driver.findElement(By.name("q"));
            //aramaKutusu.sendKeys("merhabalar");//iki türlü de olur.
            //driver.findElement(By.id("q")).sendKeys("merhabalar");

            //GooglePage class ından bir tane nesne oluşturduk.Parametre
            //olarak şu an kullandığımız driver ı kullandık
            GooglePage googlePage = new GooglePage(driver);

            googlePage.aramaKutusu.sendKeys("selamlar");//aramaKutusu nesnesi google page sayfasından geliyor.

        }
}
