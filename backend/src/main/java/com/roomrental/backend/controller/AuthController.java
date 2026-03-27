package com.roomrental.backend.controller;

import com.roomrental.backend.dto.request.UserRequest;
import com.roomrental.backend.dto.response.UserResponse;
import com.roomrental.backend.service.AuthService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<UserResponse> register(@Valid @RequestBody UserRequest request) {
        return ResponseEntity.ok(authService.register(request));
    }

    @PostMapping("/login")
    public ResponseEntity<Map<String, String>> login(@RequestBody Map<String, String> loginRequest) {
        String token = authService.login(loginRequest.get("username"), loginRequest.get("password"));
        return ResponseEntity.ok(Map.of("token", token));
    }
}
