package com.sena.prueba.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.prueba.Entity.Routes;
import com.sena.prueba.IRepository.IBaseRepository;
import com.sena.prueba.IRepository.IRoutesRepository;
import com.sena.prueba.IService.IRoutesService;


@Service
public class RoutesService extends ABaseService <Routes> implements IRoutesService {
    @Autowired
    private IRoutesRepository repository;

    @Override
    protected IBaseRepository <Routes, Long> getRepository(){
        return repository;
    }

    
}