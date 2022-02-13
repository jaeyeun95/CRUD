package com.jy.crud.board.repository;

import com.jy.crud.board.model.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// repository
@Repository
public interface BoardRepository extends JpaRepository<BoardEntity, String> {
}
