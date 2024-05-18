package com.app.jungdream.domain.dao;

import com.app.jungdream.domain.dto.ProductDTO;
import com.app.jungdream.domain.vo.ProductVO;
import com.app.jungdream.mapper.order.OrderMapper;
import com.app.jungdream.mapper.product.ProductMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ProductDAO {

    private final ProductMapper productMapper;

    public List<ProductDTO> selectProductList() {
        return productMapper.selectProductList();
    }

    public ProductDTO selectProduct(Long productId) {
        return productMapper.selectProduct(productId);
    }

    public Long selectProductId() {
        return productMapper.selectProductId();
    }

    public void insertProduct(ProductVO productVO) {
        productMapper.insertProduct(productVO);
    }

}

