package com.app.jungdream.controller.inquiry;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/inquiry/*")
@RequiredArgsConstructor
@Slf4j
public class InquiryController {

    @GetMapping("inquiry-list")
    public String custInquiryList() {
        return "customer/cust-inquiry-list";
    }

    @GetMapping("inquiry-form")
    public String custInquiryForm() {
        return "customer/cust-inquiry-form";
    }
}
