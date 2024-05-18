package com.app.jungdream.domain.dao;

import com.app.jungdream.domain.dto.OrderDTO;
import com.app.jungdream.domain.vo.OrderVO;
import com.app.jungdream.mapper.order.OrderMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class OrderDAO {
    private final OrderMapper orderMapper;

    /* 주문 목록 조회 */
    public List<OrderDTO> selectOrderList() {
        return orderMapper.selectOrderList();
    }

    /*주문하기*/
    public void insertOrder(OrderVO orderVO){orderMapper.insertOrder(orderVO);}

    /* 주문 삭제 */
    public void deleteOrder(Long orderId) {
        orderMapper.deleteOrder(orderId);
    }

}
