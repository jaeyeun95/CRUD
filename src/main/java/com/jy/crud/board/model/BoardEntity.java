package com.jy.crud.board.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "board")
public class BoardEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)     // id를 자동으로 증가시켜주는 것 oracle 에서 sequence
    private int boardSeq;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    private String writer;

    // 생성일
    @Column(nullable = false)
    private Date registDate;

    // 수정일
    @Column(nullable = false)
    private Date modifyDate;
}
