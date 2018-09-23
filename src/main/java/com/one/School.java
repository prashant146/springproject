package com.one;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class School {

    public void print(){
        System.out.println("I AM IN SCHOOL");
    }

}
