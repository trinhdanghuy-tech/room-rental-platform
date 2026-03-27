package com.roomrental.backend.dto.request;

import com.roomrental.backend.entity.enums.UserRole;
import com.roomrental.backend.validation.PasswordMatch;
import com.roomrental.backend.validation.UniqueEmail;
import com.roomrental.backend.validation.UniqueUsername;
import jakarta.validation.constraints.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@PasswordMatch
public class UserRequest {
    @NotBlank(message = "Username is required")
    @Size(min = 3, max = 50)
    @UniqueUsername
    private String username;

    @NotBlank(message = "Password is required")
    @Size(min = 6)
    private String password;

    @NotBlank(message = "Confirm password is required")
    private String confirmPassword;

    @NotBlank(message = "Email is required")
    @Email
    @UniqueEmail
    private String email;

    private String fullName;
    private UserRole role; // LANDLORD, TENANT
    private String phone;
    private String avatarUrl;
}

