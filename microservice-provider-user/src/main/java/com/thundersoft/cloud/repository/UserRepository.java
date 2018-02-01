package com.thundersoft.cloud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.thundersoft.cloud.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
