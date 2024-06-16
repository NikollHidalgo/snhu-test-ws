package com.sena.prueba.IRepository;

import org.springframework.stereotype.Repository;

import com.sena.prueba.Entity.Countries;

@Repository
public interface ICountriesRepository extends IBaseRepository <Countries, Long> {

    
}