package com.techproed.tests;

import com.techproed.pages.FhcTripLoginPage;
import com.techproed.utilities.TestBase;
import org.testng.annotations.Test;

public class FhcTripLoginTest extends TestBase {
    @Test
    public void SiteGirisTesti() {
        driver.get("http://fhctrip-qa.com/Account/LogOn?ReturnUrl=%2FAdmin%2FUserAdmin");


    FhcTripLoginPage site = new FhcTripLoginPage(driver);
    site.KullanıcıAdi.sendKeys("manager2");
    site.sifre.sendKeys("Man1ager2!");
    site.LogIn.click();
}

}
