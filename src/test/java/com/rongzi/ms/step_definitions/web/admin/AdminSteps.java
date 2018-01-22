package com.rongzi.ms.step_definitions.web.admin;

import com.rongzi.ms.pageobjects.web.admin.AdminPage;
import com.rongzi.ms.step_definitions.StepDefs;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import static org.testng.AssertJUnit.assertTrue;

/**
 * Created by Administrator on 2018/1/17.
 */
public class AdminSteps extends StepDefs {
    private WebDriverWait wait = new WebDriverWait(driver, 5);

    @cucumber.api.java.zh_cn.那么("^进入admin页面\"([^\"]*)\"$")
    public void 进入admin页面(String title) throws Throwable {
        PageFactory.initElements(driver, AdminPage.class);
        assertTrue(driver.getTitle().contains(title));
        Reporter.log("Admin page verify successful");
    }

    @cucumber.api.java.zh_cn.并且("^点击搜索按钮$")
    public void 点击搜索按钮() throws Throwable {
        AdminPage.register_platform_btn.click();
        AdminPage.register_platform.get(1).click();
        wait.until(ExpectedConditions.elementToBeClickable(AdminPage.search)).click();
        Thread.sleep(1000 * 5);
    }
}
