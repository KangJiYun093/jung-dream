package com.app.jungdream.domain.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@ToString
public class ProductRegistrationVO {
    private Long productRegistrationId;
    private String productRegistrationName;
    private String productRegistrationSpecification;
    private String productRegistrationWeight;
    private String productRegistrationQuantity;
    private String productRegistrationPrice;
}
