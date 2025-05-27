package com.fintech.auth_service.repository;

import com.fintech.auth_service.dto.Session;

import java.util.UUID;

public interface SessionRepository {
    void save(Session session);
    Session findById(String sessionId);
    void delete(String sessionId);
    void blacklistToken(String token, long ttlMinutes);
    boolean isTokenBlacklisted(String token);
    void deleteAllSessionsForUser(UUID userId);
}
