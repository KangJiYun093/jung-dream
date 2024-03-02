package com.app.jungdream.domain.vo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class CartVO {
    private Long cartId;
    private Integer cartQuantity;
    private String cartCustomerName;
    private String cartCustomerPhone;
    private Long productId;
}
