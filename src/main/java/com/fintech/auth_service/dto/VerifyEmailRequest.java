package com.fintech.auth_service.dto;

import lombok.Data;

@Data
public class VerifyEmailRequest {
    private String token;
}
