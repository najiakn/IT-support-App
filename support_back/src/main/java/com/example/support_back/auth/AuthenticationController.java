package com.example.support_back.auth;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationService authenticationService;

    @PostMapping("/Admin/register")
    public ResponseEntity<AuthenticationResponse>register(
            @RequestBody RegisterRequest request
    ) {
        return ResponseEntity.ok(authenticationService.register(request));
    }


    @PostMapping("/Admin/registerTech")
    public ResponseEntity<AuthenticationResponse>registerTech(
            @RequestBody RegisterRequest request
    ) {
        return ResponseEntity.ok(authenticationService.registerTech(request));
    }

    @PostMapping("/registerAdmin")
    public ResponseEntity<AuthenticationResponse>registerAdmin(
            @RequestBody RegisterRequest request
    ) {
        return ResponseEntity.ok(authenticationService.registerAdmin(request));
    }

    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse>authenticate(
            @RequestBody AuthenticationRequest  request
    ) {
        return ResponseEntity.ok(authenticationService.authenticate(request));

    }


}
