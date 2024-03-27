package com.app.jungdream.service.order;

import com.app.jungdream.domain.vo.OrderVO;
import org.springframework.stereotype.Service;

@Service
public interface OrderService {
    public void saveOrder(OrderVO orderVO);
}
