package com.jvision.admin201718046.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Posts {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition="TEXT", nullable = false)
    private String title;

    private String author;

    private String admin;

    private String number;

    @Column(length=300, nullable = false)
    private String content;


    @Builder
    public Posts(String title, String content, String author, String number, String admin)
    {
        this.title = title;
        this.content = content;
        this.author = author;
        this.number = number;
        this.admin = admin;
    }

    public void update(String title, String content, String number, String admin)
    {
        this.title = title;
        this.content = content;
        this.number = number;
        this.admin = admin;
    }

}
