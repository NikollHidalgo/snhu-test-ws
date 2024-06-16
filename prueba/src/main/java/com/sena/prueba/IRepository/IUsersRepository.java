package com.sena.prueba.IRepository;

import org.springframework.stereotype.Repository;

import com.sena.prueba.Entity.Users;

@Repository
public interface IUsersRepository extends IBaseRepository <Users, Long> {

    
}