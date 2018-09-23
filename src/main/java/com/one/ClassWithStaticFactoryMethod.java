package com.one;

public class ClassWithStaticFactoryMethod {

    private ClassWithStaticFactoryMethod(){

    }

    private static ClassWithStaticFactoryMethod classWithStaticFactoryMethod= new ClassWithStaticFactoryMethod();

    public static ClassWithStaticFactoryMethod getClassWithStaticFactoryMethod(){
        return classWithStaticFactoryMethod;
    }

    public void print(){
        System.out.println("I AM IN ClassWithStaticFactoryMethod");
    }

}
