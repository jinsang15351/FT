package com.jvision.admin201718046.web.dto;

import com.jvision.admin201718046.domain.posts.Posts;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class PostsListResponseDto {
    private Long id;
    private String title;
    private String author;
    private String number;
    private String admin;

    public PostsListResponseDto(Posts entity)
    {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.author = entity.getAuthor();
        this.number = entity.getNumber();
        this.admin = entity.getAdmin();
    }
}
