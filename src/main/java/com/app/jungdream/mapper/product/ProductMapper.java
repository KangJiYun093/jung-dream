package com.app.jungdream.mapper.product;

import com.app.jungdream.domain.dto.ProductDTO;
import com.app.jungdream.domain.vo.ProductVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductMapper {
    public ProductDTO selectProduct(Long productId);

    public Long selectProductId();

    public void insertProduct(ProductVO productVO);

}
