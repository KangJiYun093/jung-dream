package com.app.jungdream.mapper.product;

import com.app.jungdream.domain.vo.ProductFileVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductFileMapper {

    public List<ProductFileVO> selectProductFile(Long productId);

    public void insertProductFile(ProductFileVO productFileVO);
}
