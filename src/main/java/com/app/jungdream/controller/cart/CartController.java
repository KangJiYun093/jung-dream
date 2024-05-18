package com.app.jungdream.controller.cart;

import com.app.jungdream.domain.dto.ProductDTO;
import com.app.jungdream.domain.vo.ProductVO;
import com.app.jungdream.service.cart.CartService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/cart/*")
@RequiredArgsConstructor
@Slf4j
public class CartController {
    private final CartService cartService;

    // 페이지로 이동(?)
    @GetMapping("add")
    public void add(Model model){
        model.addAttribute(new ProductVO());
    }

    // 장바구니에 추가
    @PostMapping("add")
    public RedirectView add(ProductVO productVO) {
        cartService.addToCart(productVO);
        return new RedirectView("/cart/list");
    }

    // 장바구니에서 상품 삭제
    @PostMapping("remove")
    public RedirectView remove(ProductVO productVO, RedirectAttributes redirectAttributes){
        cartService.removeFromCart(productVO);
        redirectAttributes.addAttribute("productId", productVO.getProductId());
        return new RedirectView("/cart/list");
    }

    // 장바구니 목록 이동
    @GetMapping("list")
    public void showList(Model model){
        model.addAttribute("cartItems", cartService.getCartItems());
    }
}
