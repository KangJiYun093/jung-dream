package com.app.jungdream.domain.vo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class FileVO {
    private Long fileId;
    private String uuid;
    private String filePath;
    private String fileName;
}
