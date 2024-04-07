package com.app.jungdream.controller;

import com.app.jungdream.domain.vo.CartVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/main")
@RequiredArgsConstructor
@Slf4j
public class MainController {

        //    헤더쪽 장바구니
        @GetMapping("cart")
        public String moveCart(){
                List<CartVO> cartVOS


                return "/cart/cart";}

        //    헤더쪽 문의하기
        @GetMapping("inquiry")
        public String moveInquiry(){ return "/customer/cust-inquiry-list";}

        //     헤더쪽 공지사항
        @GetMapping("notice")
        public String moveNotice(){ return "/customer/cust-notice";}




}
