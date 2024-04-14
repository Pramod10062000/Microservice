package com.user.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.user.entities.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, String> {

}