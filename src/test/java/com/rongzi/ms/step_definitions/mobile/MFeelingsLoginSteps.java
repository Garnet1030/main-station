package com.rongzi.ms.step_definitions.mobile;

import com.rongzi.ms.helpers.Env;
import com.rongzi.ms.modules.MLoginPageProceed;
import com.rongzi.ms.pageobjects.mobile.MCreditLoginPage;
import com.rongzi.ms.pageobjects.mobile.MFeelingsLoginPage;
import com.rongzi.ms.step_definitions.StepDefs;
import cucumber.api.PendingException;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.rongzi.ms.pageobjects.web.RongziPage.easyLoan;

/**
 * Created by Administrator on 2017/9/12 0012.
 */
public class MFeelingsLoginSteps extends StepDefs {
    private WebDriverWait wait = new WebDriverWait(driver, 10);

    @cucumber.api.java.zh_cn.假如("^我在qinghuai着陆页$")
    public void 我在qinghuai着陆页() throws Throwable {
        MLoginPageProceed.open(driver, Env.getProperty("rongzi.index"), "/lp/qinghuai");
    }


    @cucumber.api.java.zh_cn.并且("^选择城市上海$")
    public void 选择城市上海() throws Throwable {
        PageFactory.initElements(driver,MFeelingsLoginPage.CityPage.class);
        wait.until(ExpectedConditions.elementToBeClickable(MFeelingsLoginPage.CityPage.city)).click();

    }

    @cucumber.api.java.zh_cn.当("^输入立即免费申请的信息$")
    public void 输入立即免费申请的信息() throws Throwable {
        PageFactory.initElements(driver,MFeelingsLoginPage.class);

        MFeelingsLoginPage.username.sendKeys("li");
        MFeelingsLoginPage.mobile.sendKeys("18321950423");
        MFeelingsLoginPage.imgCode.sendKeys("1234");
        MFeelingsLoginPage.smsCode.sendKeys("123456");
    }

    @cucumber.api.java.zh_cn.同时("^点击立即免费申请$")
    public void 点击立即免费申请() throws Throwable {
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,50)");
        wait.until(ExpectedConditions.elementToBeClickable(MFeelingsLoginPage.submit)).click();
    }



}
