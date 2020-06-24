package com.sorec.concentrateur.offre.domain;
import java.util.Date;
import lombok.Data;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.Valid;
 

@Valid
@Data
@Entity
@Table(name = "CHEVAUX")
public class Cheval implements Serializable{
	

  private static final long serialVersionUID = 6458302738668743451L;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "IDCHEVAL")
  private Integer idCheval;
  
  @Column(name = "IDCOURSE")
  private Integer idCourse;
  
  @Column(name = "NUMCHEVAL")
  private Integer numCheval;
  
  @Column(name = "CODECHVAL")
  private String codeCheval;
  
  @Column(name = "NOMCHEVAL")
  private String nomeCheval;
  
  @Column(name = "declarerNP")
  private Boolean declarerNP;
  
  @Column(name = "ESTPARTANTCHEVAL")
  private Integer estPartantCheval;
  
  @Column(name = "ECURIE")
  private String ecurie;
  
  @Column(name = "DATEPARTANTCHEVAL")
  private Date datePartantCheval;

}



