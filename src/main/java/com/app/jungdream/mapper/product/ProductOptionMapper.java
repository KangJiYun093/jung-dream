package com.app.jungdream.mapper.product;

import com.app.jungdream.domain.vo.ProductOptionVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductOptionMapper {
    public void insertProductOption(ProductOptionVO productOptionVO);
}
