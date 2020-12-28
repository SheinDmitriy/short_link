package shein.dmitriy.short_link.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import shein.dmitriy.short_link.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByRoleName(String roleName);
}
