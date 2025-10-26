package com.blog.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.time.LocalDateTime;

public class CommentDTO {

    @Data
    public static class CreateRequest {
        @NotBlank
        @Size(max = 500)
        private String content;

        private Long postId;
        private Long parentId;
    }

    @Data
    public static class UpdateRequest {
        @NotBlank
        @Size(max = 500)
        private String content;
    }

    @Data
    public static class Response {
        private Long id;
        private String content;
        private UserDTO author;
        private Long postId;
        private Response parent;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;
    }
}
