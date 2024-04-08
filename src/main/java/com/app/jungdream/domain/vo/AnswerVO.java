package com.app.jungdream.domain.vo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class AnswerVO {
    private Long answerId;
    private String answerContent;
    private String answerCreateDate;
    private String answerUpdateDate;
    private Long inquiryId;
}
