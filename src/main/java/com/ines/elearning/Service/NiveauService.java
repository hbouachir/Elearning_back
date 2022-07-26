package com.ines.elearning.Service;

import com.ines.elearning.Entity.Niveau;
import com.ines.elearning.Entity.User;
import com.ines.elearning.Repository.NiveauRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NiveauService implements INiveauService{

    @Autowired
    NiveauRepository nr;


    @Override
    public Niveau save(Niveau n) {
        return nr.save(n);
    }

    @Override
    public Niveau findOne(long id) {
        return nr.findById(id).orElse(null);
    }

    @Override
    public Niveau updateNiveau(Niveau n) {
        return nr.save(n);
    }

    @Override
    public void deleteNiveau(long id) {
        nr.deleteById(id);

    }

    @Override
    public List<Niveau> findAll() {
        return nr.findAll();
    }

    public Niveau findByTitre(String s){
        return nr.findChampByTitre(s);    }
}
