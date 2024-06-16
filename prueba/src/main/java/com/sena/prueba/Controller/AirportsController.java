package com.sena.prueba.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.prueba.Entity.Airports;
import com.sena.prueba.IService.IAirportsService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/airports")
public class AirportsController extends ABaseController <Airports, IAirportsService>{
    public AirportsController(IAirportsService service){
        super(service,"Airports");
    }

    
}