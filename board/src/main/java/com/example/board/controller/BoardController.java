package com.example.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//HTTP요청을 받아서 응답을 하는 컴포넌트. 스프링 부트가 자동으로 Bean으로 생성한다.
@Controller
public class BoardController {
    //게시물 목록을 보여준다.
    // 컨트롤러의 메소드가 리턴하는 문자열은 템플리 이름이다.
    //list를 리턴한다는 것은
    //classpath:/templates/list.html
    @GetMapping("/")
    public String list(){
        return "list";
    }
}
