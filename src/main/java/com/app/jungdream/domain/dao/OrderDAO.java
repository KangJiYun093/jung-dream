package com.app.jungdream.domain.dao;

import com.app.jungdream.domain.vo.OrderVO;
import com.app.jungdream.mapper.order.OrderMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class OrderDAO {
    private final OrderMapper orderMapper;

    /*주문하기*/
    public void insertOrder(OrderVO orderVO){orderMapper.insertOrder(orderVO);}

}
