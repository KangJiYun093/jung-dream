package com.app.jungdream.domain.dto;


import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class ProductDTO {
    private Long productId;
    private String productStatus;
    private String productTitle;
    private String productSeller;
    private Long productRegistrationId;
    private Long productOptionId;
    private String productOptionSpecification;
    private String productOptionWeight;
    private String productOptionQuantity;
    private Integer productOptionPrice;


}
