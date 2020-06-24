package com.sorec.concentrateur.offre.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.sorec.concentrateur.offre.domain.Cheval;



@Repository
public interface ChevalRepository extends JpaRepository<Cheval, Integer> {


}