package com.sena.prueba.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.prueba.Entity.Aircrafts;
import com.sena.prueba.IService.IAircraftsService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/aircrafts")
public class AircraftsController extends ABaseController <Aircrafts, IAircraftsService> {
    public AircraftsController(IAircraftsService service){
        super(service, "Aircrafts");
    }

    
}