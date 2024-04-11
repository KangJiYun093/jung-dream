package com.app.jungdream.controller.admin;

import com.app.jungdream.domain.dto.ProductRequestDTO;
import com.app.jungdream.domain.vo.ProductFileVO;
import com.app.jungdream.domain.vo.ProductOptionVO;
import com.app.jungdream.domain.vo.ProductRegistrationVO;
import com.app.jungdream.domain.vo.ProductVO;
import com.app.jungdream.service.admin.AdminService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

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

    @PostMapping("product/save")
    public void productSave(@RequestBody ProductRequestDTO productRequestDTO) {
        adminService.saveProduct(productRequestDTO.getProductVO(), productRequestDTO.getProductOptionVOS(), productRequestDTO.getProductFileVOS());
    }
}
