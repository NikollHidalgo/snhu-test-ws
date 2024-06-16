package com.sena.prueba.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.prueba.Entity.Aircrafts;
import com.sena.prueba.IRepository.IAircraftsRepository;
import com.sena.prueba.IRepository.IBaseRepository;
import com.sena.prueba.IService.IAircraftsService;

@Service
public class AircraftsService extends ABaseService<Aircrafts> implements IAircraftsService {
    @Autowired
    private IAircraftsRepository repository;

    @Override
    protected IBaseRepository<Aircrafts, Long> getRepository() {
        return repository;
    }

}
