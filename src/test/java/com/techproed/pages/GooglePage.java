package com.techproed.pages;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
public class GooglePage {
    WebDriver driver;
    public GooglePage(WebDriver driver) {//parametreli constructor
        //parametre olarak gelen driver nesnesini,bu class ta oluşturduğumuz (8.satırdaki) driver nesnesine eşitledik.
        //bu şekilde yeniden boş bir driver oluşturmak yerine,zaten halihazırda kullandığımız driver ı
        //bu nesne ile eşitlemiş olduk.
        this.driver=driver;
        PageFactory.initElements(driver,this);//bu constructor kalıp

    }
    @FindBy ( name = "q")
    public WebElement aramaKutusu;



    /*
    @FindBy ( xpath = "//tbody/tr")
    public List<WebElement> liste;  // findElements (s harfine dikkat)
    */

}
