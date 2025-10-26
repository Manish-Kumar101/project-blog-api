package com.blog.dto;

import com.blog.model.Post;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.*;

public class postDTO {

    @Data
    public static class CreateRequest {
        @NotBlank
        @Size(max = 100)
        private String title;

        @NotBlank
        @Size(max = 500)
        private String summary;

        @NotBlank
        private String content;

        private String featuredImage;
        private List<Long> categoryIds;
        private Post.PostStatus status = Post.PostStatus.DRAFT;
    }

    @Data
    public static class UpdateRequest {
        @Size(max = 100)
        private String title;

        @Size(max = 500)
        private String summary;

        private String content;
        private String featuredImage;
        private List<Long> categoryIds;
        private Post.PostStatus status;
    }

    @Data
    public static class Response {
        private Long id;
        private String title;
        private String summary;
        private String content;
        private String featuredImage;
        private String slug;
        private Post.PostStatus status;
        private UserDTO author;
        private List<CategoryDTO> categories;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;
    }
}
