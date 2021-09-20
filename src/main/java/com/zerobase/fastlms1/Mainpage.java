package com.zerobase.fastlms1;

//main page 클래스를 만드느목적!!
//매핑하기위해서 ...
// 주소와 (논리적인주소 인터넷주소) 물리적인 파일 (프로그래밍을 해야하니까) 매핑


//http://www. naver.com/new/list.do
//하나의 주소에 대해서
//어디서 매핑? 누가 매핑?
//후보군 ? 클래스 , 속성, 매소드

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mainpage {


    @RequestMapping("/")
    public String index(){

        return "Idex Page";
    }
    @RequestMapping("/hello")
    public String hello(){
        String msg= "<html>" +
                "<head>" +
                "</head>" +
                "<body>" +
                "hello \r\n fastlms website!!!!" +
                "</body>" +
                "</html>";



        return msg;
    }
}

