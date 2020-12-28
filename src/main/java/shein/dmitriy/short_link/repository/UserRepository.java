package shein.dmitriy.short_link.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import shein.dmitriy.short_link.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
