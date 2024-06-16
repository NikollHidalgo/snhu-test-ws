package com.sena.prueba.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.prueba.Entity.CabinTypes;
import com.sena.prueba.IRepository.IBaseRepository;
import com.sena.prueba.IRepository.ICabinTypesRepository;
import com.sena.prueba.IService.ICabinTypesService;

@Service
public class CabinTypesService extends ABaseService <CabinTypes> implements ICabinTypesService {
    @Autowired
    private ICabinTypesRepository repository;

    @Override
    protected IBaseRepository <CabinTypes, Long> getRepository(){
        return repository;
    }

    
}