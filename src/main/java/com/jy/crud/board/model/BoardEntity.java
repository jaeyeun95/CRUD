package com.jy.crud.board.model;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
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

    // 삭제여부
    private String delYn;

    // 생성일
    @CreatedDate
    private LocalDateTime createdDate;

    // 수정일
    @LastModifiedDate
    private LocalDateTime modifiedDate;

    @Builder
    public BoardEntity(String title, String content, String writer){
        this.title = title;
        this.content = content;
        this.writer = writer;
    }
}
