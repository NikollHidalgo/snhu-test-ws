package com.sena.prueba.IRepository;


import org.springframework.stereotype.Repository;

import com.sena.prueba.Entity.Roles;

@Repository
public interface IRolesRepository extends IBaseRepository <Roles, Long> {

    
}