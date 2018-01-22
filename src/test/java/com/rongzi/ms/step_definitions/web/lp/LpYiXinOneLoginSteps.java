package com.rongzi.ms.step_definitions.web.lp;

import com.rongzi.ms.pageobjects.web.lp.LpYiXinOneLoginPage;
import com.rongzi.ms.step_definitions.StepDefs;
import cucumber.api.PendingException;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Administrator on 2017/10/9 0009.
 */
public class LpYiXinOneLoginSteps extends StepDefs{
    @cucumber.api.java.zh_cn.假如("^我在宜信one着陆页首页\"([^\"]*)\"$")
    public void 我在宜信one着陆页首页(String LpYiXinOneIndex) throws Throwable {
        driver.get(LpYiXinOneIndex);
    }

    @cucumber.api.java.zh_cn.并且("^输入宜信one着陆页用户信息$")
    public void 输入宜信one着陆页用户信息() throws Throwable {
        PageFactory.initElements(driver, LpYiXinOneLoginPage.class);
        LpYiXinOneLoginPage.username.sendKeys("li");
        LpYiXinOneLoginPage.telphone.sendKeys("18321950423");
    }

    @cucumber.api.java.zh_cn.同时("^点击宜信one着陆页立即申请$")
    public void 点击宜信one着陆页立即申请() throws Throwable {
       LpYiXinOneLoginPage.consult.click();
    }


}
