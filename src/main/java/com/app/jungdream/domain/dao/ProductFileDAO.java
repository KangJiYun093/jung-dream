package com.app.jungdream.domain.dao;

import com.app.jungdream.domain.vo.ProductFileVO;
import com.app.jungdream.mapper.product.ProductFileMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class ProductFileDAO {

    private final ProductFileMapper productFileMapper;

    public void insertProductFile(ProductFileVO productFileVO) {
        productFileMapper.insertProductFile(productFileVO);
    }
}
