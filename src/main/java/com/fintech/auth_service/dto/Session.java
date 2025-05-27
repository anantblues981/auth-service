package com.fintech.auth_service.dto;

import lombok.Data;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class Session {
    private UUID sessionId;
    private UUID userId;
    private String accessToken;
    private String refreshToken;
    private LocalDateTime createdAt;
    private LocalDateTime expiresAt;
    private LocalDateTime refreshExpiresAt;
    private boolean isValid;
}
