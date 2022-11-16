package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner { // CommandLineRunner을 상속받으면 run 메서드를 자동실행함

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }


    @Autowired
    DataSource dataSource;

    @Override
    public void run(String... args) throws Exception { // 실행점
        Connection conn = dataSource.getConnection();
        PreparedStatement ps = conn.prepareStatement()
    }
}
