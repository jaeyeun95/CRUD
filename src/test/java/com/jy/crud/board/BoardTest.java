package com.jy.crud.board;

import com.jy.crud.board.model.BoardEntity;
import com.jy.crud.board.repository.BoardRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BoardTest {

    @Autowired
    BoardRepository boardRepository;

    // 게시글 쓰기
    @Test
    void write(){
        BoardEntity board = BoardEntity.builder()
                .title("1번글")
                .content("1번 내용")
                .writer("글슨이")
                .delYn("N")
                .build();

        boardRepository.save(board);

    }
}
