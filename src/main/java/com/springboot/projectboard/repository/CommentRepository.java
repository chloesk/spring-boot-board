package com.springboot.projectboard.repository;

import com.springboot.projectboard.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
