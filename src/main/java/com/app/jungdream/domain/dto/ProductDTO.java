package com.app.jungdream.domain.dto;


import com.app.jungdream.domain.vo.ProductFileVO;
import com.app.jungdream.domain.vo.ProductOptionVO;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
public class ProductDTO {
    private Long productId;
    private String productSalesUnit;
    private String productStatus;
    private String productTitle;
    private String productSeller;
    private Long productRegistrationId;
    private String productRegistrationName;
    private String productFilePath;
    private List<ProductOptionVO> productOptionVOS;
    private List<ProductFileVO> productFileVOS;
}
