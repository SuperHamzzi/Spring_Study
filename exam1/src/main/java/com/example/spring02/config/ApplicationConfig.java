package com.example.spring02.config;


import com.example.spring02.component.MyDao;
import com.example.spring02.component.MyService;
import com.example.spring02.component.MyUtil;
import exam.Book;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//Java Config설정을 AnnotationConfigApplicationContext 읽어들인다.
// ApplicationConfig에 대한 인스턴스를 만든다.
@Configuration
public class ApplicationConfig {
    public ApplicationConfig() {
        System.out.println("ApplicationConfig()");
    }

    @Bean
    public Book book1() {
        return new Book();
    }

    @Bean
    public Book book2() {
        Book book = new Book();
        book.setTitle("즐거운 자바");
        book.setPrice(9000);
        return book;
    }

    @Bean
    public MyService myService(MyDao myDao) {
        MyService myService = new MyService();
        myService.setMyDao(myDao);
        return myService;
    }

    @Bean
    public MyDao myDao() {

        return new MyDao();
    }

//    @Bean
//    public MyUtil myUtil(){
//        return new MyUtil();
//    }
}

