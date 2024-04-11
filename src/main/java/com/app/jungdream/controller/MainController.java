package com.app.jungdream.controller;

import com.app.jungdream.domain.vo.CartVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.lang.reflect.Member;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/main")
@RequiredArgsConstructor
@Slf4j
public class MainController {

        //    헤더쪽 장바구니
        @GetMapping("cart")
        public String moveCart(){
                List<CartVO> cartVOS;


                return "/cart/cart";}

        //    헤더쪽 문의하기
        @GetMapping("inquiry")
        public String moveInquiry(){ return "/customer/cust-inquiry-list";}

        //     헤더쪽 공지사항
        @GetMapping("notice")
        public String moveNotice(){ return "/customer/cust-notice";}

        //      세션 인증(?)
        @GetMapping("session-info")
        public String sessionInfo(HttpServletRequest req) {
                HttpSession session = req.getSession(false);

                if (session == null) {
                        return "세션이 없음";
                }

                log.info("sessionId = {}", session.getId());
                log.info("getMaxInactiveInterval={}", session.getMaxInactiveInterval());
                log.info("creationTime={}", new Date(session.getCreationTime()));
                log.info("lastAccessTime={}", new Date(session.getLastAccessedTime()));

                return "세션";

        }

        /*
        *       appliction.properties
        *
        *       1) server.servlet.session.timeout = 초 기준 추가
        *       2) session.setMaxInactiveInterval(???); => 세션 유지 맥스 시간 설정
        *
        * */

}
