package com.jy.crud.board.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
    // 생성일
    private Date registDate;
    // 수정일
    private Date modifyDate;
}
