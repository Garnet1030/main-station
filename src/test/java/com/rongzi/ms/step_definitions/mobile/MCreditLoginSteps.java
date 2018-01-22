package com.rongzi.ms.step_definitions.mobile;

import com.rongzi.ms.helpers.Env;
import com.rongzi.ms.modules.MLoginPageProceed;
import com.rongzi.ms.pageobjects.mobile.MCreditLoginPage;
import com.rongzi.ms.step_definitions.StepDefs;
import cucumber.api.java.zh_cn.假如;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MCreditLoginSteps extends StepDefs {
    private WebDriverWait wait = new WebDriverWait(driver, 10);

    @假如("^我在信用着陆页$")
    public void 我在信用着陆页() throws Throwable {
        MLoginPageProceed.open(driver, Env.getProperty("rongzi.index"), "/lp/xinyong");
    }


    @cucumber.api.java.zh_cn.并且("^选择贷款城市北京$")
    public void 选择贷款城市北京() throws Throwable {
        PageFactory.initElements(driver,MCreditLoginPage.class);
        wait.until(ExpectedConditions.elementToBeClickable(MCreditLoginPage.city)).click();
        PageFactory.initElements(driver, MCreditLoginPage.CityPage.class);
        wait.until(ExpectedConditions.elementToBeClickable(MCreditLoginPage.CityPage.city)).click();
    }

    @cucumber.api.java.zh_cn.当("^输入信用贷款信息$")
    public void 输入信用贷款信息() throws Throwable {
        MCreditLoginPage.username.sendKeys("li");
        MCreditLoginPage.mobile.sendKeys("18321950423");
        MCreditLoginPage.imgCode.sendKeys("1234");
        MCreditLoginPage.smsCode.sendKeys("123456");
    }

    @cucumber.api.java.zh_cn.同时("^点击免费申请贷款$")
    public void 点击免费申请贷款() throws Throwable {
        MCreditLoginPage.submit.click();
    }
}
