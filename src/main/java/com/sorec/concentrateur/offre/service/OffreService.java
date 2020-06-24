package com.sorec.concentrateur.offre.service;


import javax.validation.constraints.NotNull;

import com.sorec.concentrateur.offre.domain.Cheval;
import com.sorec.concentrateur.offre.domain.Course;
import com.sorec.concentrateur.offre.domain.Produit;


public interface OffreService {

    
    Cheval  getCheval(@NotNull Integer id);
    Course  getCourse(@NotNull Integer id);
    Produit getProduit(@NotNull Integer id);


    
}
