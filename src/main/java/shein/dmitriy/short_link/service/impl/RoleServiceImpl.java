package shein.dmitriy.short_link.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shein.dmitriy.short_link.entity.Role;
import shein.dmitriy.short_link.repository.RoleRepository;
import shein.dmitriy.short_link.service.RoleService;

@Service
@Slf4j
public class RoleServiceImpl implements RoleService {

    private RoleRepository roleRepository;

    @Autowired
    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public Role findByName(String roleName) {
        return roleRepository.findByRoleName(roleName);
    }
}
