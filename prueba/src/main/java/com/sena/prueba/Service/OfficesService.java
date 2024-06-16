package com.sena.prueba.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.prueba.Entity.Offices;
import com.sena.prueba.IRepository.IBaseRepository;
import com.sena.prueba.IRepository.IOfficesRepository;
import com.sena.prueba.IService.IOfficesService;

@Service
public class OfficesService extends ABaseService <Offices> implements IOfficesService {
    @Autowired
    private IOfficesRepository repository;

    @Override
    protected IBaseRepository <Offices, Long> getRepository(){
        return repository;
    }

    
}