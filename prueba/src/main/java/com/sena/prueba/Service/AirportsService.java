package com.sena.prueba.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.prueba.Entity.Airports;
import com.sena.prueba.IRepository.IAirportsRepository;
import com.sena.prueba.IRepository.IBaseRepository;
import com.sena.prueba.IService.IAirportsService;

@Service
public class AirportsService extends ABaseService <Airports> implements IAirportsService {
    @Autowired
    private IAirportsRepository repository;

    @Override
    protected IBaseRepository <Airports, Long> getRepository(){
        return repository;
    }

    
}