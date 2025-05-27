package com.fintech.auth_service.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class AuthResponse {
    private String status;
    private String message;
    private UUID userId;
    private String accessToken;
    private String refreshToken;
}
