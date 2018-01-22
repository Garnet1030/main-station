package com.rongzi.ms.step_definitions.mobile.mlp;

import com.rongzi.ms.pageobjects.mobile.mlp.MlpOnekeyLoginPage;
import com.rongzi.ms.step_definitions.StepDefs;
import org.openqa.selenium.support.PageFactory;

public class MlpOnekeyLoginSteps extends StepDefs{
    @cucumber.api.java.zh_cn.假如("^我在onekey着陆页首页\"([^\"]*)\"$")
    public void 我在onekey着陆页首页(String OnekeyIndex) throws Throwable {
        driver.get(OnekeyIndex);
    }

    @cucumber.api.java.zh_cn.当("^输入onekey贷款信息$")
    public void 输入onekey贷款信息() throws Throwable {
        PageFactory.initElements(driver,MlpOnekeyLoginPage.class);
        MlpOnekeyLoginPage.city.click();
        PageFactory.initElements(driver, MlpOnekeyLoginPage.CityPage.class);
        MlpOnekeyLoginPage.CityPage.city.click();
        MlpOnekeyLoginPage.username.sendKeys("li");
        MlpOnekeyLoginPage.mobile.sendKeys("18321950423");
        MlpOnekeyLoginPage.imgcode.sendKeys("1234");
        MlpOnekeyLoginPage.smscode.sendKeys("123456");
        MlpOnekeyLoginPage.submit.click();

    }
}
