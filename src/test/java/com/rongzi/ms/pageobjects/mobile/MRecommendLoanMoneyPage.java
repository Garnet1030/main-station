package com.rongzi.ms.pageobjects.mobile;

import com.rongzi.ms.pageobjects.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MRecommendLoanMoneyPage extends BaseClass {

	public MRecommendLoanMoneyPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"LoanAmount_scroll\"]/div/div[2]/div[2]/input")
	public static WebElement loan_amount;

	@FindBy(how = How.XPATH, using = "//*[@id=\"LoanPerod_scroll\"]/div/div[2]/div[2]/input")
	public static WebElement loan_period;

	@FindBy(how = How.XPATH, using = "//*[@id=\"Identity_scroll\"]/div[2]/div[2]/ul/li[1]/a")
	public static WebElement identity;

	@FindBy(how = How.XPATH, using = "//*[@id=\"CanProvideEarningsInformation_scroll\"]/div[2]/div[2]/ul/li[1]/a")
	public static WebElement income_Prove;


	@FindBy(how = How.XPATH, using = "//*[@id=\"WorkingCity_scroll\"]/div[2]/div[2]")
	public static WebElement working_city;

	@FindBy(how = How.XPATH, using = "//*[@id=\"WorkingAge_scroll\"]/div[2]/div[2]")
	public static WebElement working_age;

	@FindBy(how = How.XPATH, using = "//*[@id=\"Age_scroll\"]/div[2]/div[2]/input")
	public static WebElement age;

	@FindBy(how = How.XPATH, using = "//*[@id=\"Age_scroll\"]/div[2]/div[2]/input")
	public static WebElement residence_time;

	@FindBy(how = How.XPATH, using = "//*[@id=\"CensusRegisterSeatCity_scroll\"]/div[2]/div[2]")
	public static WebElement register_city;

	@FindBy(how = How.XPATH, using = "//*[@id=\"CreditStanding_scroll\"]/div[2]/div[2]")
	public static WebElement credit_standing;


	@FindBy(how = How.XPATH, using = "//*[@id=\"UseLoanCity_scroll\"]/div[2]")
	public static WebElement loan_city;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[1]/div/div[2]/ng-view/section/div/div[3]/div/div[2]")
	public static WebElement submit;

	}







