package com.rongzi.ms.pageobjects.web.admin;

import com.rongzi.ms.pageobjects.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by lining on 2017/9/10.
 */
public class AdminLoginPage extends BaseClass {
    public AdminLoginPage(WebDriver driver) {
        super(driver);
    }

  @FindBy(how = How.XPATH, using = "//*[@id=\"userName\"]")
    public static WebElement username;

    @FindBy(how = How.XPATH, using = "//*[@id=\"userPwd\"]")
    public static WebElement password;

    @FindBy(how = How.XPATH, using = "//*[@id=\"btnSubmit\"]")
    public static WebElement login_button;

}
