package com.sena.prueba.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.prueba.Entity.Roles;
import com.sena.prueba.IService.IRolesService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/roles")
public class RolesController extends ABaseController <Roles, IRolesService> {
    public RolesController(IRolesService service){
        super(service, "Roles");
    }

    
}