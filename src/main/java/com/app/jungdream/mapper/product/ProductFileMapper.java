package com.app.jungdream.mapper.product;

import com.app.jungdream.domain.vo.ProductFileVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductFileMapper {

    public void insertProductFile(ProductFileVO productFileVO);
}
