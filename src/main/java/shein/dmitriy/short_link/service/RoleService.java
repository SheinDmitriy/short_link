package shein.dmitriy.short_link.service;

import shein.dmitriy.short_link.entity.Role;

public interface RoleService {

    Role findByName(String roleName);
}
