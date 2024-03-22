package com.app.jungdream.notice;

import com.app.jungdream.domain.dao.NoticeDAO;
import com.app.jungdream.domain.vo.NoticeVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class NoticeTests {

    @Autowired
    public NoticeDAO noticeDAO;

    @Autowired
    NoticeVO noticeVO;

    @Test
    public void insertNoticeTest() {
        for(int i = 1; i <= 10; i++) {

            noticeVO.setNoticeTitle("제목" + i);
            noticeVO.setNoticeContent("내용" + i);

            noticeDAO.insertNotice(noticeVO);
        }
    }

    @Test
    public void updateNoticeTest() {
        for(int i = 33; i <= 42; i++) {

            noticeVO.setNoticeId(Long.valueOf(i));
            noticeVO.setNoticeTitle("제목 수정" + i);
            noticeVO.setNoticeContent("내용 수정" + i);

            noticeDAO.updateNotice(noticeVO);
        }
    }

    @Test
    public void selectNoticeTest() {
        log.info(noticeDAO.selectNotice(34L).toString());
    }

    @Test
    public void selectAllNoticeTest() {
        log.info(noticeDAO.selectAllNotice().toString());
    }

    @Test
    public void deleteNoticeTest() {
        noticeDAO.deleteNotice(38L);
    }
}
