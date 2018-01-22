package com.rongzi.ms.pageobjects.web.admin;

import com.rongzi.ms.pageobjects.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AdminUserInfoPage extends BaseClass {

    public AdminUserInfoPage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(how=How.XPATH, using="//*[@id=\"btnSearch\"]")
    public static WebElement search;


    @FindBy(how=How.XPATH, using="//*[@id=\"Cell_phone\"]")
    public static WebElement cellphone;

    @FindBy(how=How.XPATH, using="//*[@id=\"applyTime\"]")
    public static WebElement regist_starttime;

    @FindBy(how=How.XPATH, using="//*[@id=\"applyTime2\"]")
    public static WebElement regist_endtime;


}
