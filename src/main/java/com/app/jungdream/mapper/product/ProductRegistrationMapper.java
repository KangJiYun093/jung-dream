package com.app.jungdream.mapper.product;

import com.app.jungdream.domain.vo.ProductRegistrationVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductRegistrationMapper {

    public List<ProductRegistrationVO> selectAllProductRegistration();

    public ProductRegistrationVO selectProductRegistration(Long productRegistrationId);

    public void insertProductRegistration(ProductRegistrationVO productRegistrationVO);

    public void updateProductRegistration(ProductRegistrationVO productRegistrationVO);
}
