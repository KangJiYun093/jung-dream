package com.app.jungdream.service.cart;

import com.app.jungdream.domain.vo.ProductVO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CartServiceImpl implements CartService {
    @Override
    public void addToCart(ProductVO productVO) {

    }

    @Override
    public void removeFromCart(ProductVO productVO) {

    }

    @Override
    public List<ProductVO> getCartItems() {
        return null;
    }
}
