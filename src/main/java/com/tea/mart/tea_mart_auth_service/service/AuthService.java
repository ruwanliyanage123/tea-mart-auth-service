package com.tea.mart.tea_mart_auth_service.service;

import com.tea.mart.tea_mart_auth_service.dto.MenuIconDTO;
import com.tea.mart.tea_mart_auth_service.mapper.EntityDTOMapper;
import com.tea.mart.tea_mart_auth_service.repository.AuthRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AuthService {
    private AuthRepository authRepository;

    public AuthService(AuthRepository authRepository) {
        this.authRepository = authRepository;
    }

    public MenuIconDTO createMenuIcon(MenuIconDTO dto){
        return EntityDTOMapper.map(authRepository.save(EntityDTOMapper.map(dto)));
    }

    public List<MenuIconDTO> getAllMenuItems(){
        return authRepository.findAll().stream().map(EntityDTOMapper::map).collect(Collectors.toList());
    }
}
