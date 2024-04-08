package com.app.jungdream.service.order;

import com.app.jungdream.domain.dao.OrderDAO;
import com.app.jungdream.domain.vo.OrderVO;
import com.app.jungdream.service.admin.AdminService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class OrderServicelmpl implements OrderService {
    private final OrderDAO orderDAO;

    /*상품 주문*/
    @Override
    public void saveOrder(OrderVO orderVO){ orderDAO.insertOrder(orderVO); }
}
