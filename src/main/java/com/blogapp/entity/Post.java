package com.blogapp.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "title")
    private String title;

    @Column(name = "iamge")
    private String image;

    @Column(length = 500,name = "content")
    private String content;

    @Column(name = "create_date")
    private LocalDateTime createDate;

    @Column(name = "update_data")
    private LocalDateTime updateData;

    @Column(name = "like_count")
    private int likeCount;

    @Column(name = "viewcount")
    private int viewcount;


}
