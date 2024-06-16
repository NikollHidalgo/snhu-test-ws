package com.sena.prueba.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.prueba.Entity.Routes;
import com.sena.prueba.IService.IRoutesService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/routes")
public class RoutesController extends ABaseController <Routes, IRoutesService> {
    public RoutesController(IRoutesService service){
        super(service, "Routes");
    }

    
}