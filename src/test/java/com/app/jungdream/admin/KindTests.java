package com.app.jungdream.admin;

import com.app.jungdream.domain.dao.ProductRegistrationDAO;
import com.app.jungdream.domain.vo.ProductRegistrationVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class KindTests {

    @Autowired
    public ProductRegistrationDAO productRegistrationDAO;

    @Test
    public void insertProductRegistrationTest() {
        ProductRegistrationVO productRegistrationVO = new ProductRegistrationVO();

        productRegistrationVO.setProductRegistrationName("사과");
        productRegistrationVO.setProductRegistrationSpecification("Y");
        productRegistrationVO.setProductRegistrationWeight("Y");
        productRegistrationVO.setProductRegistrationQuantity("Y");
        productRegistrationVO.setProductRegistrationPrice("Y");

        productRegistrationDAO.insertProductRegistration(productRegistrationVO);
    }

    @Test
    public void updateProductRegistrationTest() {
        ProductRegistrationVO productRegistrationVO = new ProductRegistrationVO();

        productRegistrationVO.setProductRegistrationId(1L);
        productRegistrationVO.setProductRegistrationName("과사");
        productRegistrationVO.setProductRegistrationSpecification("N");
        productRegistrationVO.setProductRegistrationWeight("Y");
        productRegistrationVO.setProductRegistrationQuantity("N");
        productRegistrationVO.setProductRegistrationPrice("Y");

        productRegistrationDAO.updateProductRegistration(productRegistrationVO);
    }

    @Test
    public void selectAllProductRegistrationTest() {
        log.info(productRegistrationDAO.selectAllProductRegistration().get(0).getProductRegistrationName());
    }

    @Test
    public void selectProductRegistrationTest() {
        log.info(productRegistrationDAO.selectProductRegistration(1L).getProductRegistrationName());
    }
}
