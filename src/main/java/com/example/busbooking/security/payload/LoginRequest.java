package com.example.busbooking.security.payload;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class LoginRequest {

    private String email;
    private String password;
}
