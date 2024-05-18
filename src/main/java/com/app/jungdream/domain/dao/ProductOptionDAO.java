package com.app.jungdream.domain.dao;

import com.app.jungdream.domain.vo.ProductOptionVO;
import com.app.jungdream.mapper.product.ProductOptionMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ProductOptionDAO {
    private final ProductOptionMapper productOptionMapper;

    public List<ProductOptionVO> selectProductOption(Long productId) {
        return productOptionMapper.selectProductOption(productId);
    }

    public void insertProductOption(ProductOptionVO productOptionVO) {
        productOptionMapper.insertProductOption(productOptionVO);
    }
}
