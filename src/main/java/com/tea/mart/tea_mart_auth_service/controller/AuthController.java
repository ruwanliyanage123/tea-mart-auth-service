package com.tea.mart.tea_mart_auth_service.controller;

import com.tea.mart.tea_mart_auth_service.dto.MenuIconDTO;
import com.tea.mart.tea_mart_auth_service.service.AuthService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/auth/api/")
public class AuthController {

    private AuthService authService;

    public AuthController(AuthService authService){
        this.authService = authService;
    }

    @GetMapping(value = "/menu")
    public ResponseEntity<List<MenuIconDTO>> getAllMenuIcons(){
        return new ResponseEntity<>(authService.getAllMenuItems(), HttpStatus.OK);
    }

    @PostMapping(value = "/menu")
    public ResponseEntity<MenuIconDTO> createMenu(@RequestBody MenuIconDTO dto){
        return new ResponseEntity<>(authService.createMenuIcon(dto), HttpStatus.CREATED);
    }
}
