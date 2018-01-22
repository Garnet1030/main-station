package com.rongzi.ms.pageobjects.mobile.mlp;

import com.rongzi.ms.pageobjects.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MlpHongbaoLoginPage extends BaseClass {

	public MlpHongbaoLoginPage(WebDriver driver)
	{
		super(driver);
	}

	@FindBy(how=How.XPATH, using="//*[@id=\"hongbao\"]/section/div[2]/div")
	public static WebElement open_immediately;

	public static class ApplyPage {

		@FindBy(how=How.XPATH, using="//*[@id=\"phone\"]")
		public static WebElement mobile;

		@FindBy(how=How.XPATH, using="//*[@id=\"yzm\"]")
		public static WebElement imgcode;

		@FindBy(how=How.XPATH, using="//*[@id=\"msg\"]")
		public static WebElement smscode;

		@FindBy(how=How.XPATH, using="//*[@id=\"hongbao\"]/section/div[3]/p")
		public static WebElement submit;

	}


	public static class CityPage {

		@FindBy(how=How.XPATH, using="//*[@id=\"hongbao\"]/div[1]/div/ul[1]/li[3]/a")
		public static WebElement city;


	}




}
