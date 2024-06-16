package com.sena.prueba.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.prueba.Entity.Countries;
import com.sena.prueba.IService.ICountriesService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/countries")
public class CountriesController extends ABaseController <Countries, ICountriesService> {
    public CountriesController(ICountriesService service){
        super(service, "Countries");
    }


}