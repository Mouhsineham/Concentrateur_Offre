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
public class Ecurie implements Serializable{
  /**
	 * 
	 */
	private static final long serialVersionUID = -1167529376857295915L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "IDCOURSE")
  private BigDecimal idReunion;

  @Column(name = "IDPRODUIT")
  private BigDecimal idProduit;

  @Column(name = "NOMECURIE")
  private String nomEcurie;


}


