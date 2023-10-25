package com.ludlabs.ludlabs.controller;

import com.ludlabs.ludlabs.DTO.LoginRequestDTO;
import com.ludlabs.ludlabs.DTO.LoginResponseDTO;
import com.ludlabs.ludlabs.entity.User;
import com.ludlabs.ludlabs.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/api/v1/auth")
public class LoginController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/login")
    public ResponseEntity<LoginResponseDTO> authenticate(@RequestBody LoginRequestDTO request) throws IOException {

        User user = userRepository.findByNameAndPassword(request.getUsername(), request.getPassword());
        if (user == null) {
            return ResponseEntity.notFound().build();
        }

        LoginResponseDTO loginResponseDTO = new LoginResponseDTO();
        loginResponseDTO.setUsername(user.getName());
        loginResponseDTO.setPassword(user.getPassword());


        return ResponseEntity.status(HttpStatus.OK).body(loginResponseDTO);
    }
}



