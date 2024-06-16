package com.sena.prueba.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.prueba.Entity.Offices;
import com.sena.prueba.IService.IOfficesService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/offices")
public class OfficesController extends ABaseController <Offices, IOfficesService> {
    public OfficesController(IOfficesService service){
        super(service, "Offices");
    }

    
}