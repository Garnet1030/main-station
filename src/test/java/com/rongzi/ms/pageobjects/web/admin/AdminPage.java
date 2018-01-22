package com.rongzi.ms.pageobjects.web.admin;

import com.rongzi.ms.pageobjects.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class AdminPage extends BaseClass {

    public AdminPage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(how=How.XPATH, using="//a[@href=\"/User/LogOut\"]")
    public static WebElement log_out;

    @FindBy(how=How.XPATH, using="//ul[@class=\"ul-menu\"]/li[1]/a/i[2]")
    public static WebElement user_manager;

    @FindBy(how=How.XPATH, using="//*[@href=\"/usermanage/index\"]")
    public static WebElement user_info;

    @FindBy(how=How.XPATH, using="//*[@href=\"/statistic/registersource\"]")
    public static WebElement register_source;

    @FindBy(how=How.XPATH, using="//*[@class=\"select2-selection__arrow\"]")
    public static WebElement register_platform_btn;

    @FindBy(how=How.XPATH, using="//*[@class=\"select2-results__options\"]/li")
    public static List<WebElement> register_platform;

    @FindBy(how=How.XPATH, using="//*[@id=\"form_search_condition\"]/ul/li[4]/button")
    public static WebElement search;

    @FindBy(how=How.XPATH, using="//ul[@class=\"ul-menu\"]/li[4]/a/i[2]")
    public static WebElement operation_manager;

    @FindBy(how=How.XPATH, using="//*[@href=\"/BusinessInMotion/CustomServiceRequirement\"]")
    public static WebElement custom_requirement;

}
