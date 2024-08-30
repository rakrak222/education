package com.newlecture.web.class8th.java.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws 음수가되는Exception {

        System.out.println(Calc.sub(1000000,1));

//      예외처리3
//        try (
//            FileInputStream fis = new FileInputStream("");
//            FileOutputStream fos = new FileOutputStream("");
//        ){
//            fis.read();
//        } catch (FileNotFoundException e) {
//
//        } catch (IOException e) {
//
//        }

//      예외처리2

//        int result = Calc.add(2,3);
//
//
//        result = Calc.sub(100000,2);
//        System.out.println(result);

//        try {
//            System.out.println(Calc.sub(1,2));
//        }   catch (음수가되는Exception e) {
//                System.out.println(e.getMessage());
//        }
//           catch (매개변수가10000을넘는Exception e){
//
//        }
    }
}
