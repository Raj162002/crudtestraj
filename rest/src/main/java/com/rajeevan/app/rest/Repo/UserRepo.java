package com.rajeevan.app.rest.Repo;

import com.rajeevan.app.rest.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
