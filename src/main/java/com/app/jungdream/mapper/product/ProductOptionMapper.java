package com.app.jungdream.mapper.product;

import com.app.jungdream.domain.vo.ProductOptionVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductOptionMapper {

    public List<ProductOptionVO> selectProductOption(Long productId);

    public void insertProductOption(ProductOptionVO productOptionVO);
}
