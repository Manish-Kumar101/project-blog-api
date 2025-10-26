package com.blog.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Data
public class CategoryDTO {
    private Long id;

    @NotBlank
    @Size(max = 50)
    private String name;

    @Size(max = 200)
    private String description;

    private String slug;
    private LocalDateTime createdAt;

    @Data
    public static class CreateRequest {
        @NotBlank
        @Size(max = 50)
        private String name;

        @Size(max = 200)
        private String description;
    }

    @Data
    public static class UpdateRequest {
        @Size(max = 50)
        private String name;

        @Size(max = 200)
        private String description;
    }
}
