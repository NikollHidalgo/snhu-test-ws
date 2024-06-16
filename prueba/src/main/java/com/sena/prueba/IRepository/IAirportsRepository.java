package com.sena.prueba.IRepository;

import org.springframework.stereotype.Repository;

import com.sena.prueba.Entity.Airports;

@Repository
public interface IAirportsRepository extends IBaseRepository <Airports, Long> {

    
}