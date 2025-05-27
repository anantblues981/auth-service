package com.fintech.auth_service.controller;

import com.fintech.auth_service.dto.*;
import com.fintech.auth_service.service.AuthenticationService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@AllArgsConstructor
public class AuthenticationController {

    private final AuthenticationService authenticationService;

    @PostMapping("/register")
    public ResponseEntity<AuthResponse> register(@RequestBody RegisterRequest request) {
        AuthResponse response = authService.register(request);
        return ResponseEntity.status(response.getStatus().equals("success") ? 201 : 400).body(response);
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@RequestBody LoginRequest request) {
        AuthResponse response = authService.login(request);
        return ResponseEntity.status(response.getStatus().equals("success") ? 200 : 401).body(response);
    }

    @PostMapping("/validate")
    public ResponseEntity<AuthResponse> validate(@RequestBody ValidateRequest request) {
        AuthResponse response = authService.validate(request);
        return ResponseEntity.status(response.getStatus().equals("success") ? 200 : 401).body(response);
    }

    @PostMapping("/logout")
    public ResponseEntity<AuthResponse> logout(@RequestBody LogoutRequest request) {
        AuthResponse response = authService.logout(request);
        return ResponseEntity.status(response.getStatus().equals("success") ? 200 : 404).body(response);
    }

    @PostMapping("/verify-email")
    public ResponseEntity<AuthResponse> verifyEmail(@RequestBody VerifyEmailRequest request) {
        AuthResponse response = authService.verifyEmail(request);
        return ResponseEntity.status(response.getStatus().equals("success") ? 200 : 400).body(response);
    }
}
