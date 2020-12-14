package com.jvision.admin201718046.web.dto;

import com.jvision.admin201718046.domain.posts.Posts;
import lombok.Getter;

@Getter
public class PostsResponseDto {
    private Long id;
    private String title;
    private String content;
    private String author;
    private String number;
    private String admin;

    public PostsResponseDto(Posts entity)
    {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.author = entity.getAuthor();
        this.number = entity.getNumber();
        this.admin = entity.getAdmin();

    }

}
