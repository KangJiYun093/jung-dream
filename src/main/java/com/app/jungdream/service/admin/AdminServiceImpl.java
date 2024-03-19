package com.app.jungdream.service.admin;

import com.app.jungdream.domain.dao.ProductRegistrationDAO;
import com.app.jungdream.domain.vo.ProductRegistrationVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class AdminServiceImpl implements AdminService {

    private final ProductRegistrationDAO productRegistrationDAO;

    @Override
    public void saveRegistration(ProductRegistrationVO productRegistrationVO) {
        productRegistrationDAO.insertProductRegistration(productRegistrationVO);
    }
}
