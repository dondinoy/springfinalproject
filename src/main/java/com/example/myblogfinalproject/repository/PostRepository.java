package com.example.myblogfinalproject.repository;

import com.example.myblogfinalproject.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  PostRepository extends JpaRepository<Post, Long> {
}