package com.app.jungdream.controller.notice;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/notice/*")
@RequiredArgsConstructor
@Slf4j
public class NoticeController {

    @GetMapping("notice")
    public String notice() {
        return "customer/cust-notice";
    }

    @GetMapping("notice-detail")
    public String noticeDetail() {
        return "customer/cust-notice-detail";
    }
}
