package com.rongzi.ms.pageobjects.web.admin;

import com.rongzi.ms.pageobjects.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class AdminCustomRequirePage extends BaseClass {

    public AdminCustomRequirePage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(how=How.XPATH, using="//*[@id=\"btnSearch\"]")
    public static WebElement search;

    @FindBy(how=How.XPATH, using="//*[@id=\"ApplyUserIdOrCellphone\"]")
    public static WebElement cellphone;

    @FindBy(how=How.XPATH, using="//*[@id=\"applyTime\"]")
    public static WebElement regist_starttime;

    @FindBy(how=How.XPATH, using="//*[@id=\"applyTime2\"]")
    public static WebElement regist_endtime;

    @FindBy(how=How.XPATH, using="//section[@class=\"sec-data\"]/table[@id=\"tb\"]/tbody")
    public static List<WebElement> data_recordid;

    @FindBy(how=How.XPATH, using="//*[@class=\"call-phone\"]/i")
    public static WebElement call_btn;

}
