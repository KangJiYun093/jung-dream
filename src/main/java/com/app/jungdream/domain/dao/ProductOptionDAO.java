package com.app.jungdream.domain.dao;

import com.app.jungdream.domain.vo.ProductOptionVO;
import com.app.jungdream.mapper.product.ProductOptionMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class ProductOptionDAO {
    private final ProductOptionMapper productOptionMapper;

    public void insertProductOption(ProductOptionVO productOptionVO) {
        productOptionMapper.insertProductOption(productOptionVO);
    }
}
