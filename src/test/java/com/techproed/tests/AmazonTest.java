package com.techproed.tests;
import com.techproed.pages.AmazonPage;
import com.techproed.utilities.TestBase;
import org.testng.annotations.Test;
public class AmazonTest extends TestBase {
    @Test
    public void aramaTesti(){
        driver.get("http://amazon.com");
        // AmazonPage'in içerisindeki bulmuş olduğumuz WebElement'i
        // kullanabilmek için AmazonPage class'ından nesne üretiyoruz.
        AmazonPage amazonPage = new AmazonPage(driver);
        amazonPage.aramaKutusu.sendKeys("Baby Stroller");
    }
}
//Anladığım şu sayfaları ayrı oluşturuyoruz ve web elementlerinin hepsini bu page sayfalarına yazıyoruz.
//test için test classları oluşturuyoruz.bu daha düzenli görünüyor.