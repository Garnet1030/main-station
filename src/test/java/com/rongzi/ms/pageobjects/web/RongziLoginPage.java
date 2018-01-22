package com.rongzi.ms.pageobjects.web;

import com.rongzi.ms.pageobjects.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RongziLoginPage extends BaseClass {

	public RongziLoginPage(WebDriver driver)
	{
		super(driver);
	}

	@FindBy(how=How.XPATH, using="//*[@id=\"login_telephone\"]")
	public static WebElement telephone;

	@FindBy(how=How.XPATH, using="//*[@id=\"smsVerCode\"]")
	public static WebElement graphic_verification_code;

	@FindBy(how=How.XPATH, using="//*[@id=\"SmsCode\"]")
	public static WebElement smsCode;

	@FindBy(how=How.XPATH, using="//*[@id=\"loginSub2\"]")
	public static WebElement login;






}
