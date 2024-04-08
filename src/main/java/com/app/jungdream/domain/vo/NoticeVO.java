package com.app.jungdream.domain.vo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class NoticeVO {
    private Long noticeId;
    private String noticeTitle;
    private String noticeContent;
    private String noticeCreateDate;
    private String noticeUpdateDate;
}
