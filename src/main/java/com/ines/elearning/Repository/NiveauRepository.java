package com.ines.elearning.Repository;

import com.ines.elearning.Entity.Niveau;
import com.ines.elearning.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NiveauRepository  extends JpaRepository<Niveau, Long> {
}
