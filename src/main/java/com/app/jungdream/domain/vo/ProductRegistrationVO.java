package com.app.jungdream.domain.vo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class ProductRegistrationVO {
    private Long productRegistrationId;
    private String productRegistrationSpecification;
    private String productRegistrationWeight;
    private String productRegistrationQuantity;
    private String productRegistrationPrice;
}
