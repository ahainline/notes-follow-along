package com.secure.notes_follow_along.repositories;

import com.secure.notes_follow_along.models.AppRole;
import com.secure.notes_follow_along.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByRoleName(AppRole appRole);
}
