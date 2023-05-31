package com.spring.blog.payload.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.List;

@Builder
@Data
public class JoinUserResponseDto {

    private Long id;
    private String email;
    private String name;
    private LocalDateTime createdAt;

}
