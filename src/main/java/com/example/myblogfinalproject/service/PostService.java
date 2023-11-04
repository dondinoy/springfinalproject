package com.example.myblogfinalproject.service;

import com.example.myblogfinalproject.dto.CreatePosRequestDto;
import com.example.myblogfinalproject.dto.ResponsePostDto;

import java.util.Collection;

public interface PostService {
    //add a post: get a request dto ->
    ResponsePostDto addPost(CreatePosRequestDto dto);
    Collection<ResponsePostDto>getAll();

    // save the entity
    // return a response dto
}
