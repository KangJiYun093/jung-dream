package com.app.jungdream.mapper.product;

import com.app.jungdream.domain.dto.ProductDTO;
import com.app.jungdream.domain.vo.ProductVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {

    public List<ProductDTO> selectProductList();

    public ProductDTO selectProduct(Long productId);

    public Long selectProductId();

    public void insertProduct(ProductVO productVO);

}
