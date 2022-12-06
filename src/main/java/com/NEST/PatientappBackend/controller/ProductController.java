package com.NEST.PatientappBackend.controller;

import com.NEST.PatientappBackend.DAO.ProductDAO;
import com.NEST.PatientappBackend.model.ProductModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductDAO dao;

    @CrossOrigin(origins = "*")
    @GetMapping("/viewPatients")
    public List<ProductModel> ViewPatients(){
        return (List<ProductModel>) dao.findAll();
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addPatients", consumes = "application/json", produces = "application/json")
    public String AddPatients(@RequestBody ProductModel m){
        System.out.println(m.getPatientId());
        System.out.println(m.getPatientName());
        System.out.println(m.getAddress());
        System.out.println(m.getAdmitDate());
        System.out.println(m.getDoctorName());
        dao.save(m);
        return "added patirnts";
    }
}
