package com.techproed.tests;
import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Ornek_AmazonKayitSayfasi extends TestBase  {    // DAY 14 - 6 Eylül 2020 Pazar
    @Test
    public void test01(){
        driver.get("http://amazon.com");
        // 4 dk süreniz.
        // 1. Adım : Mouse'u moveToElement methodunu kullanarak, Account & Lists
        //           webelementinin üzerine götürün.
        // 2. Adım : Start here. linkine tıklayın.
        WebElement button = driver.findElement(By.id("nav-link-accountList"));
        Actions actions = new Actions(driver);
        // mouse'u webelement'in üzerine götürme işlemi yapıyoruz.
        actions.moveToElement(button).perform();
        // xpath ->      //*[.='Start here.']
        WebElement startHereLink = driver.findElement(By.partialLinkText("Start here."));
        startHereLink.click();
        // 3. Adım : Sayfanın title'ı Amazon Registration ise testiniz başarılı olsun.
        // True kullanarak Assert.assertTrue(driver.getTitle().equals("Amazon Registration"));
        // Assert.assertFalse(!driver.getTitle().equals("Amazon Registration"));
        Assert.assertEquals(driver.getTitle(),"Amazon Registration");//bunu kullanmak en iyisi
    }
    @Test(dependsOnMethods = "test01")
    public void test02(){
        // 10 dk süreniz başladı.
        WebElement isim = driver.findElement(By.xpath("//input[@id='ap_customer_name']"));
        isim.sendKeys("alperen");
        //driver.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys("alperen"); böyle de olurdu

        WebElement email = driver.findElement(By.id("ap_email"));
        email.sendKeys("alperenyigitoglu58@gmail.com");

        WebElement sifre = driver.findElement(By.id("ap_password"));
        sifre.sendKeys("1a2b3c4d5e6f.!");

        WebElement emailKutusu = driver.findElement(By.id("ap_password_check"));
        emailKutusu.sendKeys("1a2b3c4d5e6f.!");

        driver.findElement(By.id("continue")).click();

    }
}