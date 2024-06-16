package com.sena.prueba.IRepository;

import org.springframework.stereotype.Repository;

import com.sena.prueba.Entity.Tickets;

@Repository
public interface ITicketsRepository extends IBaseRepository <Tickets, Long> {

    
}