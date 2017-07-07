package com.rongzi.ms.modules;

import com.rongzi.ms.domain.UserLoanInfo;
import com.rongzi.ms.helpers.Log;
import com.rongzi.ms.pageobjects.RightIntelligentLoanPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

public class IntelligentLoanProceed {

    public static void executeRightLoan(WebDriver driver, UserLoanInfo userLoanInfo) {

            Actions action = new Actions(driver);

            RightIntelligentLoanPage.username.sendKeys(userLoanInfo.getUsername());

            List<WebElement> selects = RightIntelligentLoanPage.selects;

            action.moveToElement(RightIntelligentLoanPage.gender).perform();
            WebDriverWait wait = new WebDriverWait(driver, 10);

            WebElement female = selects.get(1);
            wait.until(ExpectedConditions.visibilityOf(female));
            female.click();
            Log.info("选择女士");

            action.moveToElement(RightIntelligentLoanPage.identity).perform();
            WebElement enterprise = selects.get(3);
            wait.until(ExpectedConditions.visibilityOf(enterprise));
            enterprise.click();
            Log.info("选择企业主");

            action.moveToElement(RightIntelligentLoanPage.loanMoney).perform();
            WebElement three = selects.get(7);
            wait.until(ExpectedConditions.visibilityOf(three));
            three.click();
            Log.info("选择3");

            RightIntelligentLoanPage.userMobile.sendKeys(userLoanInfo.getTelephone());
    }

}
