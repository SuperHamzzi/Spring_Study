package com.example.spring02;

import com.example.spring02.component.MyDao;
import com.example.spring02.component.MyService;
import com.example.spring02.component.MyUtil;
import exam.Book;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApplicationContextExam3 {

    public static void main(String[] args) {

        // AnnotationConfigApplicationContext의 생성자는 base package
        ApplicationContext context = new AnnotationConfigApplicationContext("com.example.spring02");
        Book book1 = context.getBean("book1", Book.class);
        book1.setTitle("즐거운 String Boot");
        book1.setPrice(5000);

        System.out.println(book1.getTitle());
        System.out.println(book1.getPrice());


        Book book11 = context.getBean("book2", Book.class);
        System.out.println(book11.getTitle());
        System.out.println(book11.getTitle());

        MyDao myDao = context.getBean("myDao", MyDao.class);
        myDao.get();


        MyService myService = context.getBean("myService", MyService.class);
        myService.service();
//
//        MyUtil myUtil = context.getBean("myUtil", MyUtil.class);
//        myUtil.print();

        MyUtil myUtil = context.getBean("myUtil",MyUtil.class);
        myUtil.print();
    }
}


