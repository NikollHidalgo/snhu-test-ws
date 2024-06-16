package com.sena.prueba.IRepository;

import org.springframework.stereotype.Repository;

import com.sena.prueba.Entity.CabinTypes;

@Repository
public interface ICabinTypesRepository extends IBaseRepository <CabinTypes, Long> {

    
}