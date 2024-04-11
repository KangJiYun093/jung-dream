package com.app.jungdream.domain.dto;

import com.app.jungdream.domain.vo.ProductFileVO;
import com.app.jungdream.domain.vo.ProductOptionVO;
import com.app.jungdream.domain.vo.ProductVO;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
public class ProductRequestDTO {
    private ProductVO productVO;
    private List<ProductOptionVO> productOptionVOS;
    private List<ProductFileVO> productFileVOS;
}
