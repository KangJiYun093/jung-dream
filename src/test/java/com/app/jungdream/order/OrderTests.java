package com.app.jungdream.order;

import com.app.jungdream.domain.dao.OrderDAO;
import com.app.jungdream.domain.vo.OrderVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class OrderTests {

    @Autowired
    OrderVO orderVo;

    @Autowired
    OrderDAO orderDAO;

//    @Test
//    public void insertOrderTest(){
//        OrderVO orderVO = new OrderVO();
//
//        orderVO.setOrderId(1L);
//        orderVO.setOrderAddress("address");
//        orderVO.setOrderQuantity(1);
//        orderVO.setOrderStatus("status");
//        orderVO.setOrderCustomerPhone("010-1111-1111");
//        orderVO.setOrderDeliveryDate("2024-00-00");
//        orderVO.setOrderCustomerName("홍길동");
//        orderVO.setOrderRecipientName("받는 이");
//        orderVO.setOrderRecipientPhone("010-2222-2222");
//        orderVO.setProductId(1L);
//        orderVO.setOrderTotalPrice(10000);
//
//        orderDAO.insertOrder(orderVO);

    }


}
