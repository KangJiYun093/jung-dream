package com.app.jungdream.mapper.cart;

import com.app.jungdream.domain.vo.CartVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CartMapper {
//    장바구니에 상품 추가
    public void insertCartItem(CartVO cartVO);

//    수정
    public void updateInCartItem(CartVO cartVO);

//    목록
    public List<CartVO> selectAll();

//    조회 (장바구니 전체 조회)
    public CartVO selectCart();
}
