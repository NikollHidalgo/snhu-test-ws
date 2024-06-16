package com.sena.prueba.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.prueba.Entity.CabinTypes;
import com.sena.prueba.IService.ICabinTypesService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/cabinTypes")
public class CabinTypesController extends ABaseController <CabinTypes, ICabinTypesService> {
    public CabinTypesController(ICabinTypesService service){
        super(service, "CabinTypes");
    }

    
}