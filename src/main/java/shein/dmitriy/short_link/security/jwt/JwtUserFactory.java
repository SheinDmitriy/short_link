package shein.dmitriy.short_link.security.jwt;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import shein.dmitriy.short_link.entity.Role;
import shein.dmitriy.short_link.entity.Status;
import shein.dmitriy.short_link.entity.User;

import java.util.List;
import java.util.stream.Collectors;

public final class JwtUserFactory {

    public JwtUserFactory() {
    }

    public static JwtUser create(User user){
        return new JwtUser(
                user.getId(),
                user.getUsername(),
                user.getPassword(),
                user.getStatus().equals(Status.ACTIVE),
                user.getUpdatedDate(),
                mapToGrantedAuthorities(user.getRoles())
        );
    }

    private static List<GrantedAuthority> mapToGrantedAuthorities(List<Role> userRoles){
        return userRoles.stream()
                .map(role -> new SimpleGrantedAuthority(role.getRoleName())
                ).collect(Collectors.toList());
    }
}
