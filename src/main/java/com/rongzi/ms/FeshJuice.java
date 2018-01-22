package com.rongzi.ms;

/**
 * Created by lining on 2017/7/6.
 */
public class FeshJuice {

    enum FeshJuiceSize {SMALL,MEDIUM,LARGE}
    FeshJuiceSize size;


}

class FeshJuiceTest {

    public static void main(String[] args){

        FeshJuice juice = new FeshJuice();
        juice.size=FeshJuice.FeshJuiceSize.MEDIUM;

    }


}