package com.sena.prueba.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.prueba.Entity.Tickets;
import com.sena.prueba.IRepository.IBaseRepository;
import com.sena.prueba.IRepository.ITicketsRepository;
import com.sena.prueba.IService.ITicketsService;

@Service
public class TicketsService extends ABaseService <Tickets> implements ITicketsService {
    @Autowired
    private ITicketsRepository repository;

    @Override
    protected IBaseRepository <Tickets, Long> getRepository(){
        return repository;
    }

    
}