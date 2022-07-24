package com.ines.elearning.Repository;

import com.ines.elearning.Entity.Exercice;
import com.ines.elearning.Entity.Niveau;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExerciceRepository  extends JpaRepository<Exercice, Long> {
}
