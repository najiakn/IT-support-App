package com.example.support_back.auth;

import com.example.support_back.Enums.Role;
import com.example.support_back.config.JwtService;
import com.example.support_back.model.Admin;
import com.example.support_back.model.Personne;
import com.example.support_back.repository.PersonneRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class AuthenticationService {


    private final PersonneRepository personneRepository;

    private final PasswordEncoder passwordEncoder;

    private final JwtService jwtService;

    private final AuthenticationManager authenticationManager;

    //RegisterUser :
    public AuthenticationResponse register(RegisterRequest request) {
        var user = new Personne();

        user.setNom(request.getNom());
        user.setMail(request.getEmail());
        user.setPassword(passwordEncoder.encode(request.getPassword()));
        user.setRole(Role.UTILISATEUR);

        user = personneRepository.save(user);
        var jwtToken = jwtService.generateToken(user);
        return AuthenticationResponse.builder()
                .token(jwtToken)
                .build();


    }

    //RegisterTechnicien :
    public AuthenticationResponse registerTech(RegisterRequest request) {
        var user =new Personne();

        user.setNom(request.getNom());
        user.setMail(request.getEmail());
        user.setPassword(passwordEncoder.encode(request.getPassword()));
        user.setRole(Role.TECHNICIEN);

        user = personneRepository.save(user);

        var jwtToken = jwtService.generateToken(user);
        return AuthenticationResponse.builder()
                .token(jwtToken)
                .build();


    }

    //Register Admin ;
    public AuthenticationResponse registerAdmin(RegisterRequest request) {
        var user =new Admin();

        user.setNom(request.getNom());
        user.setMail(request.getEmail());
        user.setPassword(passwordEncoder.encode(request.getPassword()));
        user.setRole(Role.ADMIN);

        user = personneRepository.save(user);

        var jwtToken = jwtService.generateToken(user);
        return AuthenticationResponse.builder()
                .token(jwtToken)
                .build();


    }

    public AuthenticationResponse authenticate(AuthenticationRequest request) {

        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getMail(),
                        request.getPassword()
                )
        );
        var user = personneRepository.findByMail(request.getMail())
                .orElseThrow();
        var jwtToken = jwtService.generateToken(user);
        return AuthenticationResponse.builder()
                .token(jwtToken)
                .build();


    }



}
