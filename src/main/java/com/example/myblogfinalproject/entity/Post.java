package com.example.myblogfinalproject.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(uniqueConstraints ={@UniqueConstraint(columnNames = "title")})
public class Post {
    @Id
    @GeneratedValue
    private Long id=null;
    @NotNull
    private String title;
    @NotNull
    private String name;
    @NotNull
    private String description;
    @NotNull
    private String content;
}