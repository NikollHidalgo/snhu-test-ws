package com.sena.prueba.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.prueba.Entity.Countries;
import com.sena.prueba.IRepository.IBaseRepository;
import com.sena.prueba.IRepository.ICountriesRepository;
import com.sena.prueba.IService.ICountriesService;


@Service
public class CountriesService extends ABaseService <Countries> implements ICountriesService {
    @Autowired
    private ICountriesRepository repository;

    @Override
    protected IBaseRepository <Countries, Long> getRepository(){
        return repository;
    }
}