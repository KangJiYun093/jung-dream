package com.app.jungdream.controller.admin;

import com.app.jungdream.domain.vo.ProductRegistrationVO;
import com.app.jungdream.service.admin.AdminService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admins/*")
@RequiredArgsConstructor
@Slf4j
public class AdminRestController {

    private final AdminService adminService;

    @PostMapping("kind/get-registration")
    public ProductRegistrationVO getRegistration(Long productRegistrationId) {
        return adminService.getProductRegistration(productRegistrationId);
    }
}
