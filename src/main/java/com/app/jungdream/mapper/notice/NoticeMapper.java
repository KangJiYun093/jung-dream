package com.app.jungdream.mapper.notice;

import com.app.jungdream.domain.vo.NoticeVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface NoticeMapper {

    public List<NoticeVO> selectAllNotice();

    public NoticeVO selectNotice(Long noticeId);

    public void insertNotice(NoticeVO noticeVO);

    public void updateNotice(NoticeVO noticeVO);

    public void deleteNotice(Long noticeId);
}
