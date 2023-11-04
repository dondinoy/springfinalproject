package com.example.myblogfinalproject.service;

import com.example.myblogfinalproject.dto.CreatePosRequestDto;
import com.example.myblogfinalproject.dto.ResponsePostDto;
import com.example.myblogfinalproject.entity.Post;
import com.example.myblogfinalproject.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@RequiredArgsConstructor


public class PostServiceImpl implements PostService {


    private final PostRepository postRepository;
    private final ModelMapper modelMapper;
    @Override
    public ResponsePostDto addPost(CreatePosRequestDto dto) {
        //DTO -> Entity
        var entity=modelMapper.map(dto, Post.class);
        //Entity ->Save
        var saved=postRepository.save(entity);
         //Return entity->response dto
        return modelMapper.map(saved,ResponsePostDto.class);
    }

    @Override
    public Collection<ResponsePostDto> getAll() {
        var all=postRepository.findAll();
        return all.stream().map(m-> modelMapper.map(m, ResponsePostDto.class)).toList();
    }
}
