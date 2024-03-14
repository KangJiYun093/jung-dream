package com.app.jungdream.domain.dao;

import com.app.jungdream.domain.vo.ProductRegistrationVO;
import com.app.jungdream.mapper.product.ProductRegistrationMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ProductRegistrationDAO {

    private final ProductRegistrationMapper productRegistrationMapper;

    public List<ProductRegistrationVO> selectAllProductRegistration() {
        return productRegistrationMapper.selectAllProductRegistration();
    }

    public ProductRegistrationVO selectProductRegistration(Long productRegistrationId) {
        return productRegistrationMapper.selectProductRegistration(productRegistrationId);
    }

    public void insertProductRegistration(ProductRegistrationVO productRegistrationVO) {
        productRegistrationMapper.insertProductRegistration(productRegistrationVO);
    }

    public void updateProductRegistration(ProductRegistrationVO productRegistrationVO) {
        productRegistrationMapper.updateProductRegistration(productRegistrationVO);
    }
}
