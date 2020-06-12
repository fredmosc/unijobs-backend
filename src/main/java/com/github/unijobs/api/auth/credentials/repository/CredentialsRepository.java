package com.github.unijobs.api.auth.credentials.repository;


import com.github.unijobs.api.auth.credentials.model.Credentials;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CredentialsRepository extends JpaRepository<Credentials, Long> {
    Optional<Credentials> findByUsername(String username);
}
