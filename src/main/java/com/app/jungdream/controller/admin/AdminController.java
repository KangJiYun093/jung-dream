package com.app.jungdream.controller.admin;

import com.app.jungdream.domain.vo.ProductRegistrationVO;
import com.app.jungdream.service.admin.AdminService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
@RequestMapping("/admin/*")
@RequiredArgsConstructor
@Slf4j
public class AdminController {

    private final AdminService adminService;

    @GetMapping("kind")
    public String kind(Model model) {
        List<ProductRegistrationVO> productRegistrationVOS = adminService.getAllProductRegistration();

        model.addAttribute("productRegistrationVOS", productRegistrationVOS);

        return "admin/admin-kind";
    }

    @PostMapping("kind-save")
    public RedirectView kindSave(ProductRegistrationVO productRegistrationVO) {
        adminService.saveRegistration(productRegistrationVO);
        return new RedirectView("/admin/kind");
    }

    @PostMapping("kind-edit")
    public RedirectView kindEdit(ProductRegistrationVO productRegistrationVO) {
        adminService.editRegistration(productRegistrationVO);
        return new RedirectView("/admin/kind");
    }

    @GetMapping("goods")
    public String goods() {
        return "admin/admin-goods";
    }

    @GetMapping("order")
    public String order() {
        return "admin/order";
    }
}
