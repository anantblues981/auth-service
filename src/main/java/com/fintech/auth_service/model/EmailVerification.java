package com.fintech.auth_service.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;
import java.util.UUID;


@Entity
@Table(name = "email_verifications")
@Data
public class EmailVerification {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID verificationId;

    @Column(nullable = false)
    private UUID userId;

    @Column(nullable = false)
    private String token;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    @Column(nullable = false)
    private LocalDateTime expiresAt;

    @Column(nullable = false)
    private boolean isUsed;
}
