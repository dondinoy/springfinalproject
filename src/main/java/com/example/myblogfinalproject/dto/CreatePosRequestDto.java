package com.example.myblogfinalproject.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CreatePosRequestDto {
    @NotNull
    @Size(min = 4,max = 300)
    private String title;
    @NotNull
    @Size(min = 4,max = 5000)
    private String description;
    @NotNull
    @Size(min = 4,max = 5000)
    private String content;
}
