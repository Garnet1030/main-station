package com.rongzi.ms.step_definitions.mobile.mlp;

import com.rongzi.ms.pageobjects.mobile.mlp.MlpMinimalistLoginPage;
import com.rongzi.ms.step_definitions.StepDefs;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Administrator on 2017/10/30 0030.
 */
public class MlpMinimalistLoginSteps extends StepDefs{
    @cucumber.api.java.zh_cn.假如("^我在极简着陆页首页\"([^\"]*)\"$")
    public void 我在极简着陆页首页(String MMinimalistIndex) throws Throwable {
        driver.get(MMinimalistIndex);
    }

    @cucumber.api.java.zh_cn.并且("^输入jijian的信息$")
    public void 输入jijian的信息() throws Throwable {
        PageFactory.initElements(driver, MlpMinimalistLoginPage.CityPage.class);
        MlpMinimalistLoginPage.CityPage.city.click();
        PageFactory.initElements(driver,MlpMinimalistLoginPage.class);
        MlpMinimalistLoginPage.username.sendKeys("li");
        MlpMinimalistLoginPage.mobile.sendKeys("18321950423");
        MlpMinimalistLoginPage.imgCode.sendKeys("1234");
        MlpMinimalistLoginPage.smsCode.sendKeys("123456");

    }

    @cucumber.api.java.zh_cn.同时("^点击jijian的申请$")
    public void 点击jijian的申请() throws Throwable {
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,50)");
        MlpMinimalistLoginPage.submit.click();
    }





}
