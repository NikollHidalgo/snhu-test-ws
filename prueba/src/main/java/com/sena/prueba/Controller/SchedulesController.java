package com.sena.prueba.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.prueba.Entity.Schedules;
import com.sena.prueba.IService.ISchedulesService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/schedules")
public class SchedulesController extends ABaseController <Schedules, ISchedulesService> {
    public SchedulesController(ISchedulesService service){
        super(service, "Schedules");
    }

    
}