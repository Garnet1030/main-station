package com.rongzi.ms.step_definitions.mobile.mlp;

import com.rongzi.ms.pageobjects.mobile.mlp.MlpHongbaoLoginPage;
import com.rongzi.ms.pageobjects.web.CenterIntelligentLoanPage;
import com.rongzi.ms.step_definitions.StepDefs;
import cucumber.api.PendingException;
import cucumber.api.java.zh_cn.假如;
import cucumber.api.java.zh_cn.当;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.rongzi.ms.pageobjects.BaseClass.driver;

public class MlpHongbaoSteps extends StepDefs{
    private WebDriverWait wait = new WebDriverWait(driver, 10);

    @假如("^我在红包着陆页首页\"([^\"]*)\"$")
    public void 我在红包着陆页首页(String HongbaoIndex) throws Throwable {
        driver.get(HongbaoIndex);
    }

    @当("^输入红包着陆页信息$")
    public void 输入红包着陆页信息() throws Throwable {
        PageFactory.initElements(driver, MlpHongbaoLoginPage.CityPage.class);
        MlpHongbaoLoginPage.CityPage.city.click();
        PageFactory.initElements(driver,MlpHongbaoLoginPage.class);
        MlpHongbaoLoginPage.open_immediately.click();
        PageFactory.initElements(driver, MlpHongbaoLoginPage.ApplyPage.class);
        wait.until(ExpectedConditions.visibilityOf(MlpHongbaoLoginPage.ApplyPage.mobile));
        MlpHongbaoLoginPage.ApplyPage.mobile.sendKeys("18321950423");
        MlpHongbaoLoginPage.ApplyPage.imgcode.sendKeys("1234");
        MlpHongbaoLoginPage.ApplyPage.smscode.sendKeys("123456");
        MlpHongbaoLoginPage.ApplyPage.submit.click();
    }
}
