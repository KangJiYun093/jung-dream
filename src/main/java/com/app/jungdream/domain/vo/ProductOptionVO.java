package com.app.jungdream.domain.vo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class ProductOptionVO {
    private Long productOptionId;
    private String productOptionSpecification;
    private String productOptionWeight;
    private String productOptionQuantity;
    private Integer productOptionPrice;
    private Long productId;
}
