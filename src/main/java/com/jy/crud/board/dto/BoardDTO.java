package com.jy.crud.board.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BoardDTO {

    private int boardSeq;
    private String title;
    private String content;
    private String writer;
    // 삭제여부
    private String delYn;
    // 생성일
    private LocalDateTime createdDate;
    // 수정일
    private LocalDateTime modifiedDate;
}
