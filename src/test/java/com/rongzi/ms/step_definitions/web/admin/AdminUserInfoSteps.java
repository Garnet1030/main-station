package com.rongzi.ms.step_definitions.web.admin;

import com.rongzi.ms.pageobjects.web.admin.AdminPage;
import com.rongzi.ms.pageobjects.web.admin.AdminUserInfoPage;
import com.rongzi.ms.step_definitions.StepDefs;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Administrator on 2018/1/17.
 */
public class AdminUserInfoSteps extends StepDefs {
    private WebDriverWait wait = new WebDriverWait(driver, 5);

    @cucumber.api.java.zh_cn.并且("^点击用户管理$")
    public void 点击用户管理() throws Throwable {
        PageFactory.initElements(driver, AdminPage.class);
        wait.until(ExpectedConditions.elementToBeClickable(AdminPage.user_manager)).click();
        wait.until(ExpectedConditions.elementToBeClickable(AdminPage.user_info)).click();
    }

    @cucumber.api.java.zh_cn.那么("^进入用户信息页面$")
    public void 进入用户信息页面() throws Throwable {
        PageFactory.initElements(driver, AdminUserInfoPage.class);
    }

    @cucumber.api.java.zh_cn.同时("^输入手机号$")
    public void 输入手机号() throws Throwable {
        wait.until(ExpectedConditions.visibilityOf(AdminUserInfoPage.regist_starttime)).clear();
        AdminUserInfoPage.regist_starttime.sendKeys("2017-07-01");
        wait.until(ExpectedConditions.visibilityOf(AdminUserInfoPage.regist_endtime)).clear();
        AdminUserInfoPage.regist_endtime.sendKeys("2017-07-08");
        wait.until(ExpectedConditions.visibilityOf(AdminUserInfoPage.cellphone)).sendKeys("18800000001");
    }

    @cucumber.api.java.zh_cn.并且("^单击查询$")
    public void 单击查询() throws Throwable {
        wait.until(ExpectedConditions.elementToBeClickable(AdminUserInfoPage.search)).click();
        Thread.sleep(1000 * 5);
    }
}
