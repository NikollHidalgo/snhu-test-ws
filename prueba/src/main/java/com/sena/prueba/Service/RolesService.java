package com.sena.prueba.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.prueba.Entity.Roles;
import com.sena.prueba.IRepository.IBaseRepository;
import com.sena.prueba.IRepository.IRolesRepository;
import com.sena.prueba.IService.IRolesService;

@Service
public class RolesService extends ABaseService <Roles> implements IRolesService {
    @Autowired
    private IRolesRepository repository;

    @Override
    protected IBaseRepository <Roles, Long> getRepository(){
        return repository;
    }

    
}