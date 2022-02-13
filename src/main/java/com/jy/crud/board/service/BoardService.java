package com.jy.crud.board.service;

import com.jy.crud.board.repository.BoardRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

// 회원 서비스
@Service
@Slf4j
public class BoardService {

    public final BoardRepository boardRepository;

    public BoardService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }



}
