package com.NEST.PatientappBackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping("/viewPatients")
    public String ViewPatients(){
        return "view Patients";
    }
}
