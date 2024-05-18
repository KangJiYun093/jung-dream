package com.app.jungdream.mapper.order;

import com.app.jungdream.domain.dto.OrderDTO;
import com.app.jungdream.domain.vo.OrderVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderMapper {

    public List<OrderDTO> selectOrderList();

    public void insertOrder(OrderVO orderVO);

    public void deleteOrder(Long orderId);

}
