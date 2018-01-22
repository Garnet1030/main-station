package com.rongzi.ms.pageobjects.mobile.mlp;

import com.rongzi.ms.pageobjects.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MlpMinimalistLoginPage extends BaseClass {

	public MlpMinimalistLoginPage(WebDriver driver)
	{
		super(driver);
	}
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[1]/div[1]/div[2]/span")
	public static WebElement city;

	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[1]/div[2]/div/div[2]/input")
	public static WebElement username;

	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[1]/div[2]/div/div[3]/input")
	public static WebElement mobile;

	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[1]/div[2]/div/div[6]/button")
	public static WebElement submit;

	@FindBy(how=How.XPATH, using="//*[@id=\"imgCode\"]")
	public static WebElement imgCode;

	@FindBy(how=How.XPATH, using="//*[@id=\"smsCode\"]")
	public static WebElement smsCode;

	public static class CityPage {



		@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div/div[2]/div/ul[1]/li[3]/a")
		public static WebElement city;


	}



}
