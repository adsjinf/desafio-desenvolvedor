package br.com.oliveiratrust.apioliveiratrust.controller;

import br.com.oliveiratrust.apioliveiratrust.controller.dto.LoginRequest;
import br.com.oliveiratrust.apioliveiratrust.controller.dto.LoginResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.jwt.JwtEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TokenController {

    private final JwtEncoder jwtEncoder;

    public TokenController(JwtEncoder jwtEncoder) {
        this.jwtEncoder = jwtEncoder;
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest loginRequest){
        return null;
    }
}
