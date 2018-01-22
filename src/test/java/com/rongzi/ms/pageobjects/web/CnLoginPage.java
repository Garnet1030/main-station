package com.rongzi.ms.pageobjects.web;

import com.rongzi.ms.pageobjects.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class CnLoginPage extends BaseClass {

	public CnLoginPage(WebDriver driver)
	{
		super(driver);
	}

	@FindBy(how=How.XPATH, using="//*[@id=\"userName\"]")
	public static WebElement username;

	@FindBy(how=How.XPATH, using="//*[@id=\"userMobile\"]")
	public static WebElement mobile;

	@FindBy(how=How.XPATH, using="//*[@id=\"btn_zhencerongzi1\"]")
	public static WebElement immediate_consultation;

    @FindBy(how=How.XPATH, using="/html/body/section[3]/div[1]/div/form/input")
    public static WebElement obtain_return;

    @FindBy(how=How.XPATH, using="//*[@id=\"divLoan\"]/form/input")
    public static WebElement next_button;

    public static class NextPage extends BaseClass {

        public NextPage(WebDriver driver) {
            super(driver);
        }

        @FindBy(how=How.XPATH, using="//*[@id=\"popName\"]")
        public static WebElement username;

        @FindBy(how=How.XPATH, using="//*[@id=\"popMobile\"]")
        public static WebElement mobile;

        @FindBy(how=How.XPATH, using="//*[@id=\"popCaptcha\"]")
        public static WebElement graphic_verification_code;

        @FindBy(how=How.XPATH, using="//*[@id=\"popSmscode\"]")
        public static WebElement smscode;

        @FindBy(how=How.XPATH, using="//*[@id=\"popSubmit\"]")
        public static WebElement next_button;



    }



}
