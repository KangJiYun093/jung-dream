package com.app.jungdream.domain.vo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class InquiryVO {
    private Long inquiryId;
    private String Title;
    private String inquiryContent;
    private String inquiryCreateDate;
    private String inquiryUpdateDate;
    private String inquiryCustomerName;
    private String inquiryCustomerPhone;
}
