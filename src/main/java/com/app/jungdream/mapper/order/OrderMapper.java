package com.app.jungdream.mapper.order;

import com.app.jungdream.domain.vo.OrderVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper {
    public void insertOrder(OrderVO orderVO);

}
