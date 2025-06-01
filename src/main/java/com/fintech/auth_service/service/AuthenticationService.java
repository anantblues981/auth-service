package com.fintech.auth_service.service;

import com.fintech.auth_service.dto.AuthResponse;
import com.fintech.auth_service.dto.RegisterRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AuthenticationService {


    public AuthResponse register(RegisterRequest request) {
        return new AuthResponse();
    }
}
