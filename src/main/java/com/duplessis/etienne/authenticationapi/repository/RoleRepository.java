package com.duplessis.etienne.authenticationapi.repository;

import com.duplessis.etienne.authenticationapi.models.ERole;
import com.duplessis.etienne.authenticationapi.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {
    Optional<Role> findByName(ERole name);
}
