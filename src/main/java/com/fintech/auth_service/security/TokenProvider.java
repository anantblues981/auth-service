package com.fintech.auth_service.security;

import java.util.UUID;

public interface TokenProvider {
    String generateAccessToken(UUID userId);

    String generateRefreshToken();

    boolean validateToken(String token);
}
