package com.app.jungdream.service.admin;

import com.app.jungdream.domain.dto.ProductDTO;
import com.app.jungdream.domain.vo.ProductFileVO;
import com.app.jungdream.domain.vo.ProductOptionVO;
import com.app.jungdream.domain.vo.ProductRegistrationVO;
import com.app.jungdream.domain.vo.ProductVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AdminService {

    public List<ProductDTO> getAllProduct();

    public List<ProductRegistrationVO> getAllProductRegistration();

    public ProductRegistrationVO getProductRegistration(Long productRegistrationId);

    public void saveRegistration(ProductRegistrationVO productRegistrationVO);

    public void editRegistration(ProductRegistrationVO productRegistrationVO);

    public void saveProduct(ProductVO productVO, List<ProductOptionVO> productOptionVOS, List<ProductFileVO> productFileVOS);
}
