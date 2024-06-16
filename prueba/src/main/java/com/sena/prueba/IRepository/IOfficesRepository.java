package com.sena.prueba.IRepository;

import org.springframework.stereotype.Repository;

import com.sena.prueba.Entity.Offices;

@Repository
public interface IOfficesRepository extends IBaseRepository <Offices, Long> {

    
}