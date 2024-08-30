package com.newlecture.web.class8th.java.exception;

public class 음수가되는Exception extends Exception {

    @Override
    public String getMessage(){
        return "계산결과 값이 음수가 되어 예외가 발생하였습니다.";
    }

}
