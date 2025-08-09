package com.tea.mart.tea_mart_auth_service.dto;


public class MenuIconDTO {
    private String menuIconName;
    private String menuNavigationPath;
    private Integer permissionLevel;

    public MenuIconDTO(){
    }

    public MenuIconDTO(String menuIconName, String menuNavigationPath, Integer permissionLevel) {
        this.menuIconName = menuIconName;
        this.menuNavigationPath = menuNavigationPath;
        this.permissionLevel = permissionLevel;
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
