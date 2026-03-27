package com.roomrental.backend.dto.response;

import com.roomrental.backend.entity.enums.UserRole;
import lombok.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserResponse {
    private Long id;
    private String username;
    private String email;
    private String fullName;
    private UserRole role;
    private String phone;
    private String avatarUrl;
    private String status;
    private LocalDateTime createdAt;
}
