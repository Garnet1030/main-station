package com.rongzi.ms.step_definitions.mobile;

import com.rongzi.ms.helpers.Env;
import com.rongzi.ms.pageobjects.mobile.MRecommendLoanMoneyPage;
import com.rongzi.ms.pageobjects.web.AboutUsPage;
import com.rongzi.ms.step_definitions.StepDefs;
import cucumber.api.PendingException;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.rongzi.ms.pageobjects.mobile.MRecommendLoanMoneyPage.submit;

/**
 * Created by Administrator on 2017/9/12 0012.
 */
public class MRecommendLoanMoneySteps extends StepDefs {


    @cucumber.api.java.zh_cn.那么("^成功进入M站测评页面$")
    public void 成功进入m站测评页面() throws Throwable {
        PageFactory.initElements(driver,MRecommendLoanMoneyPage.class);
        WebDriverWait wait = new WebDriverWait(driver, 25);
        wait.until(ExpectedConditions.elementToBeClickable(MRecommendLoanMoneyPage.loan_amount)).clear();
        MRecommendLoanMoneyPage.loan_amount.sendKeys("10");
        wait.until(ExpectedConditions.elementToBeClickable(MRecommendLoanMoneyPage.loan_period)).clear();
        MRecommendLoanMoneyPage.loan_period.sendKeys("12");
        wait.until(ExpectedConditions.elementToBeClickable(MRecommendLoanMoneyPage.identity)).click();
        wait.until(ExpectedConditions.elementToBeClickable(MRecommendLoanMoneyPage.income_Prove)).click();
        wait.until(ExpectedConditions.elementToBeClickable(MRecommendLoanMoneyPage.age)).clear();
        MRecommendLoanMoneyPage.age.sendKeys("30");
        wait.until(ExpectedConditions.elementToBeClickable(MRecommendLoanMoneyPage.submit)).click();
    }

    @cucumber.api.java.zh_cn.那么("^成功进入到M站测评结果页$")
    public void 成功进入到m站测评结果页() throws Throwable {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(driver -> driver.getCurrentUrl().contains("AssessStep2?urlFlag=1#/step5"));

    }
}




