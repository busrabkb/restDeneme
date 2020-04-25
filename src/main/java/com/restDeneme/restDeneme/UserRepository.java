package com.restDeneme.restDeneme;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<dbUser,Long> {
Optional<dbUser> findById(Long id);
List<dbUser>  findByDbUsername(String id);

}
