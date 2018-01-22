package com.rongzi.ms.pageobjects.mobile.mlp;

import com.rongzi.ms.pageobjects.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MlpCepingLoginPage extends BaseClass {

    public MlpCepingLoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"landing-ceshi\"]/div[1]/div/a")
    public static WebElement start_test;

    @FindBy(how = How.XPATH, using = "//*[@id=\"landing-ceshi\"]/div[2]/div/div[1]/div[2]/div/ul/li[1]")
    public static WebElement loan_money;

    @FindBy(how = How.XPATH, using = "//*[@id=\"landing-ceshi\"]/div[2]/div/div[2]/div[2]/div/ul/li[1]")
    public static WebElement identity;

    @FindBy(how = How.XPATH, using = "//*[@id=\"landing-ceshi\"]/div[2]/div/div[3]/div[2]/div/ul/li[1]")
    public static WebElement age;

    @FindBy(how = How.XPATH, using = "//*[@id=\"landing-ceshi\"]/div[2]/div/div[4]/div[2]/div/ul/li[1]")
    public static WebElement income_type;

    @FindBy(how = How.XPATH, using = "//*[@id=\"landing-ceshi\"]/div[2]/div/div[5]/div[2]/div/ul/li[1]")
    public static WebElement salary;

    @FindBy(how = How.XPATH, using = "//*[@id=\"landing-ceshi\"]/div[2]/div/div[6]/div[2]/div/ul/li[1]")
    public static WebElement social_fund;

    @FindBy(how = How.XPATH, using = "//*[@id=\"landing-ceshi\"]/div[2]/div/div[7]/div[2]/div/ul/li[1]")
    public static WebElement working_year;


    @FindBy(how = How.XPATH, using = "//*[@id=\"landing-ceshi\"]/div[2]/div/div[8]/div[2]/div/ul/li[1]")
    public static WebElement credit;

    @FindBy(how = How.XPATH, using = "//*[@id=\"landing-ceshi\"]/div[2]/div/div[9]/div[2]/div/ul/li[1]")
    public static WebElement house;

    @FindBy(how = How.XPATH, using = "//*[@id=\"landing-ceshi\"]/div[2]/div/div[10]/div[2]/div/ul/li[1]")
    public static WebElement car;

    @FindBy(how = How.XPATH, using = "//*[@id=\"landing-ceshi\"]/div[2]/div/div[11]/div[2]/div/ul/li[1]")
    public static WebElement insurance;

    @FindBy(how = How.XPATH, using = "//*[@id=\"landing-ceshi\"]/div[3]/div/div[1]/div[1]/input")
    public static WebElement username;

    @FindBy(how = How.XPATH, using = "//*[@id=\"landing-ceshi\"]/div[3]/div/div[1]/div[2]/span")
    public static WebElement city;

    @FindBy(how = How.XPATH, using = "//*[@id=\"landing-ceshi\"]/div[9]/div/ul[1]/li[3]/a")
    public static WebElement shanghai;

    @FindBy(how = How.XPATH, using = "//*[@id=\"landing-ceshi\"]/div[3]/div/div[1]/div[3]/input")
    public static WebElement telphone;

    @FindBy(how = How.XPATH, using = "//*[@id=\"landing-ceshi\"]/div[3]/div/div[1]/div[4]/input")
    public static WebElement image_code;

    @FindBy(how = How.XPATH, using = "//*[@id=\"landing-ceshi\"]/div[3]/div/div[1]/div[5]/input")
    public static WebElement sms_code;

    @FindBy(how = How.XPATH, using = "//*[@id=\"landing-ceshi\"]/div[3]/div/a")
    public static WebElement submit;


}
