package com.app.jungdream.service.admin;

import com.app.jungdream.domain.vo.ProductRegistrationVO;
import org.springframework.stereotype.Service;

@Service
public interface AdminService {

    public void saveRegistration(ProductRegistrationVO productRegistrationVO);
}
