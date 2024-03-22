package com.app.jungdream.controller.order;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/order/*")
@RequiredArgsConstructor
@Slf4j
public class OrderController {

    /*주문완료*/
    @GetMapping("/order-complete")
    public String completePage(){
        return "order/order-complete";
    }

    /*주문 페이지*/
    @GetMapping("/order")
    public String order(){
        return "order/order";
    }

    @GetMapping("/order-detail")
    public String orderDetail(){
        return "order/order-detail";
    }






}
