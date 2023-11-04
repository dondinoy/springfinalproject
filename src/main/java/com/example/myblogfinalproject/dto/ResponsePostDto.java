package com.example.myblogfinalproject.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
public class ResponsePostDto {
    private Long id;
    private String title;
    private String description;
    private String content;


}
