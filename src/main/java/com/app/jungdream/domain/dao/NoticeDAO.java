package com.app.jungdream.domain.dao;

import com.app.jungdream.domain.vo.NoticeVO;
import com.app.jungdream.mapper.notice.NoticeMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class NoticeDAO {

    private final NoticeMapper noticeMapper;

    public List<NoticeVO> selectAllNotice() {
        return noticeMapper.selectAllNotice();
    }

    public NoticeVO selectNotice(Long noticeId) {
        return noticeMapper.selectNotice(noticeId);
    }

    public void insertNotice(NoticeVO noticeVO) {
        noticeMapper.insertNotice(noticeVO);
    }

    public void updateNotice(NoticeVO noticeVO) {
        noticeMapper.updateNotice(noticeVO);
    }

    public void deleteNotice(Long noticeId) {
        noticeMapper.deleteNotice(noticeId);
    }
}
