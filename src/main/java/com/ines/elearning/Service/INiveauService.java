package com.ines.elearning.Service;

import com.ines.elearning.Entity.Niveau;
import com.ines.elearning.Entity.User;

import java.util.List;

public interface INiveauService {
    Niveau save(Niveau n);

    Niveau findOne(long id);
    Niveau updateNiveau(Niveau n);


    void deleteNiveau(long id);

    List<Niveau> findAll();
}
