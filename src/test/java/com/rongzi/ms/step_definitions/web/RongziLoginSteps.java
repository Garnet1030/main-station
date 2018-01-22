package com.rongzi.ms.step_definitions.web;
import com.rongzi.ms.pageobjects.web.RecommendLoanPage;
import com.rongzi.ms.pageobjects.web.RongziLoginPage;
import com.rongzi.ms.pageobjects.web.RongziPage;
import com.rongzi.ms.step_definitions.StepDefs;
import cucumber.api.PendingException;
import cucumber.api.java.zh_cn.并且;
import cucumber.api.java.zh_cn.当;
import cucumber.api.java.zh_cn.那么;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by lining on 2017/6/28.
 */
public class RongziLoginSteps extends StepDefs {


    @当("^点击请登陆按钮$")
    public void 点击请登陆按钮() throws Throwable {

        PageFactory.initElements(driver, RongziPage.class);
        RongziPage.login_please.click();
        RongziPage.smscode_login.click();

    }

    @并且("^填写登陆信息$")
    public void 填写登陆信息() throws Throwable {
        PageFactory.initElements(driver, RongziLoginPage.class);
        RongziLoginPage.telephone.sendKeys("18321950423");
        RongziLoginPage.graphic_verification_code.sendKeys("1234");
        RongziLoginPage.smsCode.sendKeys("123456");
        RongziLoginPage.login.click();
    }


    @cucumber.api.java.zh_cn.那么("^成功登录$")
    public void 成功登录() throws Throwable {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(RongziPage.username));
        PageFactory.initElements(driver,RongziPage.class);
        Assert.assertTrue(RongziPage.username.isDisplayed());
    }
}
