package com.tea.mart.tea_mart_auth_service.repository;

import com.tea.mart.tea_mart_auth_service.entity.MenuIconEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthRepository extends JpaRepository<MenuIconEntity, Integer> {
}
