package com.tea.mart.tea_mart_auth_service.mapper;

import com.tea.mart.tea_mart_auth_service.dto.MenuIconDTO;
import com.tea.mart.tea_mart_auth_service.entity.MenuIconEntity;

public class EntityDTOMapper {
    public static MenuIconDTO map(MenuIconEntity entity){
        MenuIconDTO dto = new MenuIconDTO();
        dto.setMenuIconName(entity.getMenuIconName());
        dto.setPermissionLevel(entity.getPermissionLevel());
        dto.setMenuNavigationPath(entity.getMenuNavigationPath());
        return dto;
    }

    public static MenuIconEntity map(MenuIconDTO dto){
        MenuIconEntity entity = new MenuIconEntity();
        entity.setMenuIconName(dto.getMenuIconName());
        entity.setPermissionLevel(dto.getPermissionLevel());
        entity.setMenuNavigationPath(dto.getMenuNavigationPath());
        return entity;
    }
}
