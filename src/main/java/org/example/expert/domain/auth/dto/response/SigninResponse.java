package org.example.expert.domain.auth.dto.response;

import lombok.Getter;
import org.example.expert.domain.user.enums.UserRole;

@Getter
public class SigninResponse {

    private final String bearerToken;

    private final UserRole userRole;

    public SigninResponse(String bearerToken, UserRole userRole) {
        this.bearerToken = bearerToken;
        this.userRole = userRole;
    }
}
