package com.sena.prueba.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.prueba.Entity.Users;
import com.sena.prueba.IRepository.IBaseRepository;
import com.sena.prueba.IRepository.IUsersRepository;
import com.sena.prueba.IService.IUsersService;

@Service
public class UsersService extends ABaseService <Users> implements IUsersService {
    @Autowired
    private IUsersRepository repository;

    @Override
    protected IBaseRepository <Users, Long> getRepository(){
        return repository;
    }

    
}