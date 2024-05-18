package com.app.jungdream.service.admin;

import com.app.jungdream.domain.dto.OrderDTO;
import com.app.jungdream.domain.dto.ProductDTO;
import com.app.jungdream.domain.vo.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AdminService {

    public List<ProductDTO> getAllProduct();

    public ProductDTO getProduct(Long productId);

    public List<ProductOptionVO> getAllProductOption(Long productId);

    public List<ProductFileVO> getAllProductFile(Long productId);

    public List<ProductRegistrationVO> getAllProductRegistration();

    public ProductRegistrationVO getProductRegistration(Long productRegistrationId);

    public void saveRegistration(ProductRegistrationVO productRegistrationVO);

    public void editRegistration(ProductRegistrationVO productRegistrationVO);

    public void saveProduct(ProductVO productVO, List<ProductOptionVO> productOptionVOS, List<ProductFileVO> productFileVOS);

    public List<OrderDTO> getAllOrder();

    public void deleteOrder(List<Long> orderIds);
}
