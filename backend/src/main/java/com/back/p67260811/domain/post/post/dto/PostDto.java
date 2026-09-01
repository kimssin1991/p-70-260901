package com.back.p67260811.domain.post.post.dto;

import com.back.p67260811.domain.post.post.entity.Post;

import java.time.LocalDateTime;

public record PostDto(
        int id,
        LocalDateTime createDate,
        LocalDateTime modifyDate,
        String title,
        String content,
       // Member author 이대로 하면 안됨 그대로 노출됨
        String nickname,
        String username
) {
    public PostDto(Post post) {
        this(
                post.getId(),
                post.getCreateDate(),
                post.getModifyDate(),
                post.getTitle(),
                post.getContent(),
                post.getAuthor().getNickname(),
                post.getAuthor().getUsername()
        );
    }
}
