package com.sorec.concentrateur.offre.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import lombok.Data;

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
@Table(name = "COURSE")
public class Course implements Serializable{
  /**
	 * 
	 */
	private static final long serialVersionUID = -1167529376857295915L;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)	
  @Column(name = "IDCOURSE ")
  private BigDecimal idCourse;
  @Column(name = "IDREUNION ")
  private BigDecimal idReunion;

  @Column(name = "CODEREUNION")
  private String codeReunion;

  @Column(name = "CODECOURSE")
  private String codeCourse;

  @Column(name = "NOMHYPODROME")
  private String nomHypodrome;

  @Column(name = "TYPECOURSE")
  private String typeCourse;

  @Column(name = "NBREPARTANTS")
  private BigDecimal nbrePartants;
  
  @Column(name = "STATUSCOURSE")
  private BigDecimal statusCourse;
  
  @Column(name = "DATECOURSE")
  private Date dataCourse;
  
  @Column(name = "HEURECOURSE")
  private Timestamp heureCourse;  


}


