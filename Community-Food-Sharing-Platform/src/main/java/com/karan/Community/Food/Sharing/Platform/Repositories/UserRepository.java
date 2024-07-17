package com.karan.Community.Food.Sharing.Platform.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.karan.Community.Food.Sharing.Platform.Entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
