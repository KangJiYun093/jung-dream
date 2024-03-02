package com.app.jungdream.domain.vo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class ProductVO {
    private Long productId;
    private String productStatus;
    private String productTitle;
    private String productSeller;
    private Long productRegistrationId;
}
