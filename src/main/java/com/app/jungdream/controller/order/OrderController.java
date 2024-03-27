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

//    private final OrderService orderService;

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
//    @PostMapping ("order")
//    public RedirectView order(Model model, OrderVO orderVo, RedirectAttributes redirectAttributes, @RequestParam(value="orderInfo") String orderInfo){
//        redirectAttributes.addFlashAttribute("orderInfo", orderInfo);
//        orderService.saveOrder(orderVo);
//        log.info("saveorder");
//        return new RedirectView("/order/order-complete");
//    }

    @GetMapping("order-detail")
    public String orderDetail(){
        return "order/product-detail";
    }






}
