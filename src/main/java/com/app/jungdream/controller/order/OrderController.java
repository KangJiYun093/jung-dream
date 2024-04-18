package com.app.jungdream.controller.order;

import com.app.jungdream.domain.vo.OrderVO;
import com.app.jungdream.service.order.OrderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/order/*")
@RequiredArgsConstructor
@Slf4j
public class OrderController {

    private final OrderService orderService;

    /*주문완료*/
    @GetMapping("order-complete")
    public String completePage(){
        return "order/order-complete";
    }

    /*주문 페이지*/
    @GetMapping("order")
    public String order(){
        return "order/order";
    }


//    /*주문하기*/
    @PostMapping("order")
    public RedirectView order(OrderVO orderVo, RedirectAttributes redirectAttributes, @RequestParam(value="orderInfo", required=false) String orderInfo){
        redirectAttributes.addFlashAttribute("orderInfo", orderInfo);
        orderService.saveOrder(orderVo);
        log.info("saveorder");
        return new RedirectView("/order/order-complete");
    }

    @GetMapping("order-detail")
    public String orderDetail(){
        return "order/product-detail";
    }






}
