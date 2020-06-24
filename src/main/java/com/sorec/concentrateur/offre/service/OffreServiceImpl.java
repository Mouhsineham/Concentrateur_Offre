package com.sorec.concentrateur.offre.service;


import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sorec.concentrateur.offre.domain.Cheval;
import com.sorec.concentrateur.offre.domain.Course;
import com.sorec.concentrateur.offre.domain.Produit;
import com.sorec.concentrateur.offre.exception.ChevalException;
import com.sorec.concentrateur.offre.exception.CourseException;
import com.sorec.concentrateur.offre.exception.ProduitException;
import com.sorec.concentrateur.offre.repository.ChevalRepository;
import com.sorec.concentrateur.offre.repository.CourseRepository;
import com.sorec.concentrateur.offre.repository.ProduitRepository;

import static com.sorec.concentrateur.offre.exception.ChevalException.Error.CHEVAL_NOT_FOUND;
import static com.sorec.concentrateur.offre.exception.ProduitException.Error.PRODUIT_NOT_FOUND;
import static com.sorec.concentrateur.offre.exception.CourseException.Error.COURSE_NOT_FOUND;

import java.util.Optional;

@Service
@Transactional
public class OffreServiceImpl implements OffreService{
	
	
    @Autowired
    ChevalRepository chevalRepository;
    
    @Autowired
    ProduitRepository produitRepository;
    
    @Autowired
    CourseRepository courseRepository;

    @Override
    public Cheval getCheval(@NotNull Integer id) {
        Optional<Cheval> cheval = chevalRepository.findById(id);
        if (!cheval.isPresent()) {
            throw new ChevalException(CHEVAL_NOT_FOUND);
        }
        return cheval.get();
    }


	@Override
	public Course getCourse(@NotNull Integer id) {
		 Optional<Course> course = courseRepository.findById(id);
		 if(!course.isPresent()) {
			 throw new CourseException(COURSE_NOT_FOUND);
		 }
		return course.get();
	}

	@Override
	public Produit getProduit(@NotNull Integer id) {
		Optional<Produit> produit = produitRepository.findById(id);
		if(!produit.isPresent()) {
			throw new ProduitException(PRODUIT_NOT_FOUND);
		}
		return produit.get();
	}

}
