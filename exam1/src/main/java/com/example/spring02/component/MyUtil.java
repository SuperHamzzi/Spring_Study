package com.example.spring02.component;

import org.springframework.stereotype.Component;

import java.sql.SQLOutput;


//AnnotationConfigApplicationContext의 @Component를 찾아서 인스턴스를 생성한다.
@Component(value ="myUtil") //뒤에 value ="myUtil을 적으면 이게 아이디가 된다.
public class MyUtil {

public MyUtil(){
    System.out.println("myUtil");
}
    public void print(){
        System.out.println("MyUtil.print()");
    }
}
