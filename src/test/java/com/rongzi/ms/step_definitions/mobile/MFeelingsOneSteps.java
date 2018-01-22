package com.rongzi.ms.step_definitions.mobile;

import com.rongzi.ms.helpers.Env;
import com.rongzi.ms.modules.MLoginPageProceed;
import com.rongzi.ms.pageobjects.mobile.MFeelingsLoginPage;
import com.rongzi.ms.pageobjects.mobile.MFeelingsOneLoginPage;
import com.rongzi.ms.step_definitions.StepDefs;
import cucumber.api.PendingException;
import cucumber.api.java.zh_cn.假如;
import cucumber.api.java.zh_cn.同时;
import cucumber.api.java.zh_cn.并且;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Administrator on 2017/9/12 0012.
 */
public class MFeelingsOneSteps extends StepDefs{
    private WebDriverWait wait = new WebDriverWait(driver, 10);


    @假如("^我在qinghuai one着陆页$")
    public void 我在qinghuaiOne着陆页() throws Throwable {
        MLoginPageProceed.open(driver, Env.getProperty("rongzi.index"), "/lp/qinghuai1");
    }


    @cucumber.api.java.zh_cn.并且("^选择城市北京$")
    public void 选择城市北京() throws Throwable {
        PageFactory.initElements(driver,MFeelingsOneLoginPage.CityPage.class);
        wait.until(ExpectedConditions.elementToBeClickable(MFeelingsOneLoginPage.CityPage.city)).click();

    }

    @cucumber.api.java.zh_cn.当("^输入情怀one的信息$")
    public void 输入情怀one的信息() throws Throwable {
       PageFactory.initElements(driver,MFeelingsOneLoginPage.class);
       MFeelingsOneLoginPage.username.sendKeys("li");
       MFeelingsOneLoginPage.mobile.sendKeys("18321950423");
       MFeelingsOneLoginPage.imgCode.sendKeys("1234");
       MFeelingsOneLoginPage.smsCode.sendKeys("123456");
    }

    @同时("^点击情怀one的申请$")
    public void 点击情怀one的申请() throws Throwable {
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,50)");
        wait.until(ExpectedConditions.elementToBeClickable(MFeelingsOneLoginPage.submit)).click();
    }



}
