package com.rongzi.ms.step_definitions.mobile;

import com.rongzi.ms.helpers.Env;
import com.rongzi.ms.modules.MLoginPageProceed;
import com.rongzi.ms.pageobjects.mobile.MFeelingsLoginPage;
import com.rongzi.ms.pageobjects.mobile.MSupermarketLoginPage;
import com.rongzi.ms.step_definitions.StepDefs;
import cucumber.api.PendingException;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Administrator on 2017/9/12 0012.
 */
public class MSupermarketLoginSteps extends StepDefs {
    private WebDriverWait wait = new WebDriverWait(driver, 10);


    @cucumber.api.java.zh_cn.假如("^我在chaoshi着陆页$")
    public void 我在chaoshi着陆页() throws Throwable {
        MLoginPageProceed.open(driver, Env.getProperty("rongzi.index"), "/lp/chaoshi");
    }

    @cucumber.api.java.zh_cn.并且("^选择城市苏州$")
    public void 选择城市苏州() throws Throwable {
        PageFactory.initElements(driver, MSupermarketLoginPage.CityPage.class);
        wait.until(ExpectedConditions.elementToBeClickable(MSupermarketLoginPage.CityPage.city)).click();

    }

    @cucumber.api.java.zh_cn.当("^输入chaoshi的信息$")
    public void 输入chaoshi的信息() throws Throwable {
        PageFactory.initElements(driver,MSupermarketLoginPage.class);
        MSupermarketLoginPage.username.sendKeys("li");
        MSupermarketLoginPage.mobile.sendKeys("18321950423");
        MSupermarketLoginPage.imgCode.sendKeys("1234");
        MSupermarketLoginPage.smsCode.sendKeys("123456");


    }


    @cucumber.api.java.zh_cn.同时("^点击chaoshi的申请$")
    public void 点击chaoshi的申请() throws Throwable {
        MSupermarketLoginPage.submit.click();
    }
}

