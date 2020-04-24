package com.restDeneme.restDeneme;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<dbUser,Long> {
}
