package com.newlecture;

import java.io.*;

class Foo {

    public static String fooName = "";

    public static void changeName(String name)
    {
        fooName = name;
    }
}

class Bar {
    public static void main(String[] args)
    {

        // 클래스명을 통해 정적 메소드(static method) 호출
        Foo.changeName("static called");
        System.out.println(Foo.fooName);

        // 객체를 통해 정적 메소드(static method) 호출.
        Foo instance = new Foo();
        instance.changeName("instance called");
        System.out.println(instance.fooName);
    }
}
