package com.rongzi.ms.step_definitions.web.admin;

import com.rongzi.ms.pageobjects.web.admin.AdminCustomRequirePage;
import com.rongzi.ms.pageobjects.web.admin.AdminPage;
import com.rongzi.ms.step_definitions.StepDefs;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Administrator on 2018/1/18.
 */
public class AdminCusrequireSteps extends StepDefs {
    private WebDriverWait wait = new WebDriverWait(driver, 5);

    @cucumber.api.java.zh_cn.并且("^点击运营管理质检融资需求书$")
    public void 点击运营管理质检融资需求书() throws Throwable {
        PageFactory.initElements(driver, AdminPage.class);
        wait.until(ExpectedConditions.elementToBeClickable(AdminPage.operation_manager)).click();
        wait.until(ExpectedConditions.elementToBeClickable(AdminPage.custom_requirement)).click();
    }

    @cucumber.api.java.zh_cn.那么("^进入质检融资需求书页面$")
    public void 进入质检融资需求书页面() throws Throwable {
        PageFactory.initElements(driver, AdminCustomRequirePage.class);
    }

    @cucumber.api.java.zh_cn.同时("^输入融资人用户手机号$")
    public void 输入融资人用户手机号() throws Throwable {
        wait.until(ExpectedConditions.visibilityOf(AdminCustomRequirePage.regist_starttime)).clear();
        AdminCustomRequirePage.regist_starttime.sendKeys("2017-07-01");
        wait.until(ExpectedConditions.visibilityOf(AdminCustomRequirePage.regist_endtime)).clear();
        AdminCustomRequirePage.regist_endtime.sendKeys("2017-07-08");
        wait.until(ExpectedConditions.visibilityOf(AdminCustomRequirePage.cellphone)).sendKeys("18800000001");
    }

    @cucumber.api.java.zh_cn.并且("^单击查询按钮$")
    public void 单击查询按钮() throws Throwable {
        wait.until(ExpectedConditions.visibilityOf(AdminCustomRequirePage.search)).click();
        Thread.sleep(1000 * 5);
    }

   @cucumber.api.java.zh_cn.那么("^拨打客服电话$")
   public void 拨打客服电话() throws Throwable {
       wait.until(ExpectedConditions.visibilityOf(AdminCustomRequirePage.data_recordid.get(0)));
       AdminCustomRequirePage.call_btn.click();
   }

}
