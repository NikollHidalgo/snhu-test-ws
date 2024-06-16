package com.sena.prueba.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.prueba.Entity.Schedules;
import com.sena.prueba.IRepository.IBaseRepository;
import com.sena.prueba.IRepository.ISchedulesRepository;
import com.sena.prueba.IService.ISchedulesService;

@Service
public class SchedulesService extends ABaseService <Schedules> implements ISchedulesService {
    @Autowired
    private ISchedulesRepository repository;

    @Override
    protected IBaseRepository <Schedules, Long> getRepository(){
        return repository;
    }

    
}