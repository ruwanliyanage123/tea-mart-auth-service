package com.tea.mart.tea_mart_auth_service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "menu-item")
public class MenuIconEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer menuId;
    private String menuIconName;
    private String menuNavigationPath;
    private Integer permissionLevel;

    public MenuIconEntity(){
    }

    public MenuIconEntity(String menuIconName, String menuNavigationPath, Integer permissionLevel) {
        this.menuIconName = menuIconName;
        this.menuNavigationPath = menuNavigationPath;
        this.permissionLevel = permissionLevel;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public String getMenuIconName() {
        return menuIconName;
    }

    public void setMenuIconName(String menuIconName) {
        this.menuIconName = menuIconName;
    }

    public String getMenuNavigationPath() {
        return menuNavigationPath;
    }

    public void setMenuNavigationPath(String menuNavigationPath) {
        this.menuNavigationPath = menuNavigationPath;
    }

    public Integer getPermissionLevel() {
        return permissionLevel;
    }

    public void setPermissionLevel(Integer permissionLevel) {
        this.permissionLevel = permissionLevel;
    }
}
