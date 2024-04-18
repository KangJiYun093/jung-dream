package com.app.jungdream.service.admin;

import com.app.jungdream.domain.dao.ProductDAO;
import com.app.jungdream.domain.dao.ProductFileDAO;
import com.app.jungdream.domain.dao.ProductOptionDAO;
import com.app.jungdream.domain.dao.ProductRegistrationDAO;
import com.app.jungdream.domain.dto.ProductDTO;
import com.app.jungdream.domain.vo.ProductFileVO;
import com.app.jungdream.domain.vo.ProductOptionVO;
import com.app.jungdream.domain.vo.ProductRegistrationVO;
import com.app.jungdream.domain.vo.ProductVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
@Slf4j
public class AdminServiceImpl implements AdminService {

    private final ProductDAO productDAO;
    private final ProductOptionDAO productOptionDAO;
    private final ProductFileDAO productFileDAO;
    private final ProductRegistrationDAO productRegistrationDAO;

    @Override
    public List<ProductDTO> getAllProduct() {
        return productDAO.selectProductList();
    }

    @Override
    public List<ProductRegistrationVO> getAllProductRegistration() {
        return productRegistrationDAO.selectAllProductRegistration();
    }

    @Override
    public ProductRegistrationVO getProductRegistration(Long productRegistrationId) {
        return productRegistrationDAO.selectProductRegistration(productRegistrationId);
    }

    @Override
    public void saveRegistration(ProductRegistrationVO productRegistrationVO) {
        productRegistrationDAO.insertProductRegistration(productRegistrationVO);
    }

    @Override
    public void editRegistration(ProductRegistrationVO productRegistrationVO) {
        productRegistrationDAO.updateProductRegistration(productRegistrationVO);
    }

    @Override
    public void saveProduct(ProductVO productVO, List<ProductOptionVO> productOptionVOS, List<ProductFileVO> productFileVOS) {
        productDAO.insertProduct(productVO);

        /* 현재 insert한 productId 세팅 및 insert */
        Long productId = productDAO.selectProductId();

        productOptionVOS.forEach(productOptionVO -> {
            productOptionVO.setProductId(productId);
            productOptionDAO.insertProductOption(productOptionVO);
        });

        productFileVOS.forEach(productFileVO -> {
            productFileVO.setProductId(productId);
            productFileDAO.insertProductFile(productFileVO);
        });
    }
}
