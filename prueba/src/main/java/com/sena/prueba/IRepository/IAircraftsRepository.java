package com.sena.prueba.IRepository;

import org.springframework.stereotype.Repository;

import com.sena.prueba.Entity.Aircrafts;

@Repository
public interface IAircraftsRepository extends IBaseRepository <Aircrafts, Long> {

    
}