package com.rongzi.ms.step_definitions.mobile.mlp;

import com.rongzi.ms.pageobjects.mobile.mlp.MlpCepingLoginPage;
import com.rongzi.ms.step_definitions.StepDefs;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MlpCepingLoginSteps extends StepDefs {

    private WebDriverWait wait = new WebDriverWait(driver, 10);

    @cucumber.api.java.zh_cn.假如("^我在测评着陆页首页\"([^\"]*)\"$")
    public void 我在测评着陆页首页(String MCepingIndex) throws Throwable {
        driver.get(MCepingIndex);
    }


    @cucumber.api.java.zh_cn.并且("^点击开始测试$")
    public void 点击开始测试() throws Throwable {
        PageFactory.initElements(driver, MlpCepingLoginPage.class);
        MlpCepingLoginPage.start_test.click();

    }

    @cucumber.api.java.zh_cn.同时("^输入ceping的信息$")
    public void 输入ceping的信息() throws Throwable {
        PageFactory.initElements(driver, MlpCepingLoginPage.class);

        wait.until(ExpectedConditions.elementToBeClickable(MlpCepingLoginPage.loan_money)).click();
        wait.until(ExpectedConditions.elementToBeClickable(MlpCepingLoginPage.identity)).click();
        wait.until(ExpectedConditions.elementToBeClickable(MlpCepingLoginPage.age)).click();
        wait.until(ExpectedConditions.elementToBeClickable(MlpCepingLoginPage.income_type)).click();
        wait.until(ExpectedConditions.elementToBeClickable(MlpCepingLoginPage.salary)).click();
        wait.until(ExpectedConditions.elementToBeClickable(MlpCepingLoginPage.social_fund)).click();
        wait.until(ExpectedConditions.elementToBeClickable(MlpCepingLoginPage.working_year)).click();
        wait.until(ExpectedConditions.elementToBeClickable(MlpCepingLoginPage.credit)).click();
        wait.until(ExpectedConditions.elementToBeClickable(MlpCepingLoginPage.house)).click();
        wait.until(ExpectedConditions.elementToBeClickable(MlpCepingLoginPage.car)).click();
        wait.until(ExpectedConditions.elementToBeClickable(MlpCepingLoginPage.insurance)).click();

    }

    @cucumber.api.java.zh_cn.那么("^输入注册信息$")
    public void 输入注册信息() throws Throwable {
        wait.until(ExpectedConditions.visibilityOf(MlpCepingLoginPage.username)).sendKeys("li");
        wait.until(ExpectedConditions.elementToBeClickable(MlpCepingLoginPage.city)).click();
        wait.until(ExpectedConditions.elementToBeClickable(MlpCepingLoginPage.shanghai)).click();
        wait.until(ExpectedConditions.visibilityOf(MlpCepingLoginPage.telphone)).sendKeys("18321950423");
        wait.until(ExpectedConditions.visibilityOf(MlpCepingLoginPage.image_code)).sendKeys("1234");
        wait.until(ExpectedConditions.visibilityOf(MlpCepingLoginPage.sms_code)).sendKeys("123456");

    }

    @cucumber.api.java.zh_cn.同时("^点击ceping的申请$")
    public void 点击ceping的申请() throws Throwable {
        wait.until(ExpectedConditions.elementToBeClickable(MlpCepingLoginPage.submit)).click();
    }

    @cucumber.api.java.zh_cn.那么("^成功进入测评结果页$")
    public void 成功进入测评结果页() throws Throwable {
        // TODO: 2017/11/6 assert
    }
}
