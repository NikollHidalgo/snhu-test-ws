package com.sena.prueba.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.prueba.Entity.Users;
import com.sena.prueba.IService.IUsersService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/users")
public class UsersController extends ABaseController <Users, IUsersService> {
    public UsersController(IUsersService service){
        super(service, "Users");
    }

    
}