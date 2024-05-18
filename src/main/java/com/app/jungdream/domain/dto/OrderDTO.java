package com.app.jungdream.domain.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class OrderDTO {
    private Long orderId;
    private String orderCustomerName;
    private String orderCustomerPhone;
    private String orderRecipientName;
    private String orderRecipientPhone;
    private String orderStatus;
    private String orderDate;
    private String orderDeliveryDate;
    private String orderAddress;
    private Integer orderQuantity;
    private Integer orderTotalPrice;
    private Long productId;
    private String productTitle;
}
