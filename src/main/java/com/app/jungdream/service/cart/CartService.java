package com.app.jungdream.service.cart;

import com.app.jungdream.domain.vo.CartVO;
import com.app.jungdream.domain.vo.ProductVO;
import org.springframework.stereotype.Service;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.List;

@Service
public interface CartService {
//    private Long cartId;
//    private Integer cartQuantity;
//    private String cartCustomerName;
//    private String cartCustomerPhone;
//    private Long productId;

    // cart 상품 추가
    void addToCart(ProductVO productVO);

    // cart 상품 삭제
    void removeFromCart(ProductVO productVO);

    // 상품 목록 반환(?)
    List<ProductVO> getCartItems();
}
