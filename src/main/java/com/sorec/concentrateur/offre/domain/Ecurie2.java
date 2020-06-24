package com.sorec.concentrateur.offre.domain;


import lombok.Data;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Time;
import java.util.Date;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.Valid;


/**
 * CourseEntity
 */
@Valid
@Data
@Entity
@Table(name = "ECURIES")
public class Ecurie2 implements Serializable{
  /**
	 * 
	 */
	private static final long serialVersionUID = -1167529376857295915L;
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "IDCOURSE")
  private Integer idCourse;

  @Column(name = "CHE_IDCHEVAL ")
  private Integer cheIdCheval;

  @Column(name = "CHE_IDCOURSE")
  private Integer cheIdCourse;
  
  @Column(name = "IDCHEVAL ")
  private Integer idCheval;
  
  @Column(name = "NOMECURIE")
  private String nomEcurie;
  

}


