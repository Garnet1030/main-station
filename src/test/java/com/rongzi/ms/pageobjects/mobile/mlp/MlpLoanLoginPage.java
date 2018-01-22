package com.rongzi.ms.pageobjects.mobile.mlp;

import com.rongzi.ms.pageobjects.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MlpLoanLoginPage extends BaseClass {

	public MlpLoanLoginPage(WebDriver driver)
	{
		super(driver);
	}
	@FindBy(how=How.XPATH, using="//*[@id=\"daikuan\"]/div[3]/div[2]/span")
	public static WebElement city;

	@FindBy(how=How.XPATH, using="//*[@id=\"UserName\"]")
	public static WebElement username;

	@FindBy(how=How.XPATH, using="//*[@id=\"phone\"]")
	public static WebElement mobile;

	@FindBy(how=How.XPATH, using="//*[@id=\"yzm\"]")
	public static WebElement imgcode;

	@FindBy(how=How.XPATH, using="//*[@id=\"msg\"]")
	public static WebElement smscode;

	@FindBy(how=How.XPATH, using="//*[@id=\"daikuan\"]/div[3]/p")
	public static WebElement submit;

	public static class CityPage {



		@FindBy(how=How.XPATH, using="//*[@id=\"daikuan\"]/div[8]/div/ul[1]/li[3]/a")
		public static WebElement city;


	}



}
