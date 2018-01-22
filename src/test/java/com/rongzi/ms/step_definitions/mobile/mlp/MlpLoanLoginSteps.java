package com.rongzi.ms.step_definitions.mobile.mlp;

import com.rongzi.ms.pageobjects.mobile.mlp.MlpLoanLoginPage;
import com.rongzi.ms.step_definitions.StepDefs;
import cucumber.api.PendingException;
import cucumber.api.java.zh_cn.假如;
import cucumber.api.java.zh_cn.当;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import static com.rongzi.ms.pageobjects.BaseClass.driver;

public class MlpLoanLoginSteps extends StepDefs{
    @假如("^我在daikuan着陆页首页\"([^\"]*)\"$")
    public void 我在daikuan着陆页首页(String LoanIndex) throws Throwable {
        driver.get(LoanIndex);
    }

    @当("^输入贷款着陆页信息$")
    public void 输入贷款着陆页信息() throws Throwable {
        PageFactory.initElements(driver, MlpLoanLoginPage.class);
        MlpLoanLoginPage.city.click();
        PageFactory.initElements(driver, MlpLoanLoginPage.CityPage.class);
        MlpLoanLoginPage.CityPage.city.click();
        MlpLoanLoginPage.username.sendKeys("li");
        MlpLoanLoginPage.mobile.sendKeys("18321950423");
        MlpLoanLoginPage.imgcode.sendKeys("1234");
        MlpLoanLoginPage.smscode.sendKeys("123456");
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,50)");
        MlpLoanLoginPage.submit.click();

    }
}
