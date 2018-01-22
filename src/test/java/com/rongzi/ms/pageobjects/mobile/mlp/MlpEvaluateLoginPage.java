package com.rongzi.ms.pageobjects.mobile.mlp;

import com.rongzi.ms.pageobjects.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MlpEvaluateLoginPage extends BaseClass {

	public MlpEvaluateLoginPage(WebDriver driver)
	{
		super(driver);
	}
	@FindBy(how=How.XPATH, using="//*[@id=\"landing-evaluate\"]/section[1]/div[1]")
	public static WebElement city;

	@FindBy(how=How.XPATH, using="//*[@id=\"landing-evaluate\"]/section[1]/div[2]/div")
	public static WebElement loan_money;

	@FindBy(how=How.XPATH, using="//*[@id=\"landing-evaluate\"]/section[1]/div[3]/input")
	public static WebElement username;

	@FindBy(how=How.XPATH, using="//*[@id=\"landing-evaluate\"]/section[1]/div[4]/input")
	public static WebElement mobile;

	@FindBy(how=How.XPATH, using="//*[@id=\"imgCode\"]")
	public static WebElement imgcode;

	@FindBy(how=How.XPATH, using="//*[@id=\"smsCode\"]")
	public static WebElement smscode;

	@FindBy(how=How.XPATH, using="//*[@id=\"landing-evaluate\"]/section[1]/div[7]/a")
	public static WebElement submit;

	public static class CityPage {

		@FindBy(how=How.XPATH, using="//*[@id=\"landing-evaluate\"]/div[1]/div/ul[1]/li[3]/a")
		public static WebElement city;


	}

	public static class OtherAmountPage {

		@FindBy(how=How.XPATH, using="//*[@id=\"other-amount\"]/ul/li[1]")
		public static WebElement other_amout;


	}


}
