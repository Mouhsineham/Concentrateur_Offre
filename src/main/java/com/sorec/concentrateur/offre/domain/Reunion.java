package com.sorec.concentrateur.offre.domain;


import lombok.Data;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Time;
import java.sql.Timestamp;
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
@Table(name = "REUNION")
public class Reunion implements Serializable{
  /**
	 * 
	 */
	private static final long serialVersionUID = -1167529376857295915L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "IDREUNION")
  private Integer idReunion;

//  @Column(name = "IDPRODUIT")
//  private Integer idProduit;

  @Column(name = "CODEREUNION")
  private String codeReunion;
  
  @Column(name = "IDHYPODROMEDEROULEMENT")
  private Integer idHypodromeDeroulement;
  
  @Column(name = "IDHYPODROMEORGANISATEUR")
  private Integer idHypodromeOrganisateur;
  
  @Column(name = "DATEREUNION")
  private Date dataReunion;
  
  @Column(name = "HEURDEMARRAGEREUNION")
  private Timestamp heureDemarrageReunion;
    
 
}


