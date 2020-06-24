package com.sorec.concentrateur.offre.domain;


import lombok.Data;
import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "PRODUIT")
public class Produit implements Serializable{
  /**
	 * 
	 */
  private static final long serialVersionUID = -1167529376857295915L;
	
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "idProduit")
  private Integer idProduit;
  
//  @Column(name = "idReunion")
//  private BigDecimal idReunion;



  @Column(name = "codeProduit")
  private String codeProduit;


}

