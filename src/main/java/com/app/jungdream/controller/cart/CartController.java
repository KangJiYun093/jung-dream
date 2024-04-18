package com.app.jungdream.controller.cart;

import com.app.jungdream.domain.dto.ProductDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/cart/*")
@RequiredArgsConstructor
@Slf4j
public class CartController {
    private List<ProductDTO> cartItems = new ArrayList<>();

    @PostMapping("/add")
    public String addItemToCart(@RequestBody ProductDTO product) {
        cartItems.add(product);
        return "장바구니에 추가: " + product.getProductTitle();
    }

    @GetMapping("/items")
    public List<ProductDTO> getCartItems() {
        return cartItems;
    }
}
