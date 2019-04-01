package com.jevin.jmartapi.controller;

import com.jevin.jmartapi.model.User;
import com.jevin.jmartapi.model.UserSignUp;
import com.jevin.jmartapi.repository.UserRepo;
import com.jevin.jmartapi.security.JwtProvider;
import com.jevin.jmartapi.security.JwtResponse;
import com.jevin.jmartapi.security.ResponseMessage;
import com.jevin.jmartapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    UserRepo userRepo;

    @Autowired
    UserService userService;

    @Autowired
    JwtProvider jwtProvider;

    @PostMapping("/signin")
    public ResponseEntity<?> authenticateUser(@Valid @RequestBody User user) {

        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword()));
        SecurityContextHolder.getContext().setAuthentication(authentication);

        String jwt = jwtProvider.generateJwtToken(authentication);
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();

        JwtResponse jwtResponse = new JwtResponse(jwt, userDetails.getUsername(), userDetails.getAuthorities());
        jwtResponse.setUserId(userRepo.findByUsername(userDetails.getUsername()).get().getId());

        return ResponseEntity.ok(jwtResponse);
    }

    @PostMapping("/signup")
    public ResponseEntity<?> registerUser(@Valid @RequestBody UserSignUp userSignUp) {

        if (userRepo.existsByUsername(userSignUp.getUsername())) {
            return new ResponseEntity<>(new ResponseMessage("Username already exists"), HttpStatus.BAD_REQUEST);
        }

        if (userRepo.existsByEmail(userSignUp.getEmail())) {
            return new ResponseEntity<>(new ResponseMessage("Email already exists"), HttpStatus.BAD_REQUEST);
        }

        userService.createUser(userSignUp);

        return new ResponseEntity<>(new ResponseMessage("User registered successfully"), HttpStatus.OK);
    }
}
