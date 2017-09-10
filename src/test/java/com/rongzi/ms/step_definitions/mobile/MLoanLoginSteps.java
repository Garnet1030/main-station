package com.rongzi.ms.step_definitions.mobile;

import com.rongzi.ms.helpers.Env;
import com.rongzi.ms.modules.LpLoginPageProceed;
import com.rongzi.ms.pageobjects.mobile.MLoanLoginPage;
import com.rongzi.ms.step_definitions.StepDefs;
import cucumber.api.java.zh_cn.假如;
import cucumber.api.java.zh_cn.同时;
import cucumber.api.java.zh_cn.并且;
import cucumber.api.java.zh_cn.那么;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class MLoanLoginSteps extends StepDefs {

    @假如("^我在\"([^\"]*)\"着陆页$")
    public void 我在着陆页(String suffix) throws Throwable {
        String index = StringUtils.replace(Env.getProperty("rongzi.index"), "www", "m");
        String city = Env.getProperty("rongzi.city", "上海");
        LpLoginPageProceed.open(driver, index, suffix);

        WebElement selectCity = driver.findElement(By.id("currentCity"));

        selectCity.click();

        List<WebElement> cities = driver.findElements(By.xpath("//*[@class=\"hot-city-section\"]/div/div/a"));

        for (WebElement element : cities) {
            if (element.getText().equals(city)) {
                element.click();
                return;
            }

        }

    }

    @并且("^输入贷款信息$")
    public void 输入贷款信息() throws Throwable {
        PageFactory.initElements(driver, MLoanLoginPage.class);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(MLoanLoginPage.username));
        MLoanLoginPage.username.sendKeys("li");
        MLoanLoginPage.mobile.sendKeys("18321950423");
        MLoanLoginPage.imgCode.sendKeys("1234");
        MLoanLoginPage.smsCode.sendKeys("123456");
    }

    @同时("^点击马上申请$")
    public void 点击马上申请() throws Throwable {
        MLoanLoginPage.submit.click();
    }

    @那么("^成功进入M站测评页面$")
    public void 成功进入m站测评页面() throws Throwable {
        // TODO: 2017/9/10 assert
    }
}
