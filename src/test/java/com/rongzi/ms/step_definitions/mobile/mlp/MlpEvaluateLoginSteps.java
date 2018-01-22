package com.rongzi.ms.step_definitions.mobile.mlp;

import com.rongzi.ms.pageobjects.mobile.mlp.MlpEvaluateLoginPage;
import com.rongzi.ms.step_definitions.StepDefs;
import cucumber.api.PendingException;
import cucumber.api.java.zh_cn.假如;
import cucumber.api.java.zh_cn.当;
import org.openqa.selenium.support.PageFactory;

public class MlpEvaluateLoginSteps extends StepDefs{
    @假如("^我在evaluate着陆页首页\"([^\"]*)\"$")
    public void 我在evaluate着陆页首页(String EvaluateIndex) throws Throwable {
        driver.get(EvaluateIndex);
    }


    @当("^输入evaluate着陆页信息$")
    public void 输入evaluate着陆页信息() throws Throwable {
        PageFactory.initElements(driver, MlpEvaluateLoginPage.class);
        MlpEvaluateLoginPage.city.click();
        PageFactory.initElements(driver, MlpEvaluateLoginPage.CityPage.class);
        MlpEvaluateLoginPage.CityPage.city.click();
        MlpEvaluateLoginPage.loan_money.click();
        PageFactory.initElements(driver,MlpEvaluateLoginPage.OtherAmountPage.class);
        MlpEvaluateLoginPage.OtherAmountPage.other_amout.click();
        MlpEvaluateLoginPage.username.sendKeys("li");
        MlpEvaluateLoginPage.mobile.sendKeys("18321950423");
        MlpEvaluateLoginPage.imgcode.sendKeys("1234");
        MlpEvaluateLoginPage.smscode.sendKeys("123456");
        MlpEvaluateLoginPage.submit.click();
    }
}
