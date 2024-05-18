package com.app.jungdream.domain.dao;

import com.app.jungdream.domain.vo.ProductFileVO;
import com.app.jungdream.mapper.product.ProductFileMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ProductFileDAO {

    private final ProductFileMapper productFileMapper;

    public List<ProductFileVO> selectProductFile(Long productId) {
        return productFileMapper.selectProductFile(productId);
    }

    public void insertProductFile(ProductFileVO productFileVO) {
        productFileMapper.insertProductFile(productFileVO);
    }
}
