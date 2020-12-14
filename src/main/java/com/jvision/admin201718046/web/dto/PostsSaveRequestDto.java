package com.jvision.admin201718046.web.dto;

import com.jvision.admin201718046.domain.posts.Posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostsSaveRequestDto {

    private String title;
    private String content;
    private String author;
    private String number;
    private String admin;

    @Builder
    public PostsSaveRequestDto(String title, String content, String author, String number, String admin)
    {
        this.title = title;
        this.content = content;
        this.author = author;
        this.number = number;
        this.admin = admin;
    }

    public Posts toEntity()
    {
        return Posts.builder()
                .title(title)
                .content(content)
                .author(author)
                .number(number)
                .admin(admin)
                .build();
    }
}
