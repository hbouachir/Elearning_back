package com.ines.elearning.Controller;


import com.fasterxml.jackson.annotation.JsonView;
import com.ines.elearning.Entity.Niveau;
import com.ines.elearning.Service.NiveauService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class NiveauController {
    @Autowired
    NiveauService ns;



    @PostMapping("/niveau/addNiveau")
     public Niveau addNiveau(@RequestBody Niveau n){
        return ns.save(n);
    }

    @PostMapping("/niveau/updateNiveau")

    public Niveau updateCourse(@RequestBody Niveau n){
        return ns.updateNiveau(n);
    }

    @DeleteMapping("/niveau/{idNiveau}")

    public void deleteNiveau(@PathVariable Long idNiveau){
        ns.deleteNiveau(idNiveau);
    }

    @GetMapping("/niveau/getAllNiveau")
    public List<Niveau> getAllCourses(){
        return ns.findAll();
    }

    @GetMapping("/Niveau/{idNiveau}")
    public Niveau getNiveau(@PathVariable Long idNiveau){
        return ns.findOne(idNiveau);
    }



}
