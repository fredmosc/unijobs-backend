package com.github.unijobs.api.repository;

import com.github.unijobs.api.model.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<Service, Long> {

}
