package com.jvision.admin201718046.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostsUpdateRequestDto {
    private String title;
    private String content;
    private String number;
    private String admin;

    @Builder
    public PostsUpdateRequestDto(String title, String content, String number, String admin)
    {
        this.title = title;
        this.content = content;
        this.number = number;
        this.admin = admin;
    }
}
