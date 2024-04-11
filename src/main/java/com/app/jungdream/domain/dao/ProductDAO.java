package com.app.jungdream.domain.dao;

import com.app.jungdream.domain.vo.ProductVO;
import com.app.jungdream.mapper.order.OrderMapper;
import com.app.jungdream.mapper.product.ProductMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class ProductDAO {
    private final ProductMapper productMapper;

    public Long selectProductId() {
        return productMapper.selectProductId();
    }

    public void insertProduct(ProductVO productVO) {
        productMapper.insertProduct(productVO);
    }

}

