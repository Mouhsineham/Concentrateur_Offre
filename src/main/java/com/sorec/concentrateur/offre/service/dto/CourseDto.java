package com.sorec.concentrateur.offre.service.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
 
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import javax.validation.Valid;


/**
 * CourseDto
 */
@ApiModel(value = "ReferenceDataTypeDto", description = "A data transfer object to expose the reference data type entity details")
@Valid
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CourseDto   {
  @ApiModelProperty(value = "idReunion")
  private BigDecimal idReunion = null;

  @ApiModelProperty(value = "idCourse")
  private BigDecimal idCourse = null;

  @ApiModelProperty(value = "codeReunion")
  private String codeReunion = null;

  @ApiModelProperty(value = "codeCourse")
  private String codeCourse = null;

  @ApiModelProperty(value = "nomHypodrome")
  private String nomHypodrome = null;

  @ApiModelProperty(value = "typeCourse")
  private String typeCourse = null;

  @ApiModelProperty(value = "nbrePartants")
  private BigDecimal nbrePartants = null;

  @ApiModelProperty(value = "listeChevaux")
  private ChevauxDto listeChevaux = null;

  @ApiModelProperty(value = "listeProduits")
  private ProduitsDto listeProduits = null;

  public CourseDto idReunion(BigDecimal idReunion) {
    this.idReunion = idReunion;
    return this;
  }

  /**
   * Get idReunion
   * @return idReunion
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getIdReunion() {
    return idReunion;
  }

  public void setIdReunion(BigDecimal idReunion) {
    this.idReunion = idReunion;
  }

  public CourseDto idCourse(BigDecimal idCourse) {
    this.idCourse = idCourse;
    return this;
  }

  /**
   * Get idCourse
   * @return idCourse
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getIdCourse() {
    return idCourse;
  }

  public void setIdCourse(BigDecimal idCourse) {
    this.idCourse = idCourse;
  }

  public CourseDto codeReunion(String codeReunion) {
    this.codeReunion = codeReunion;
    return this;
  }

  /**
   * Get codeReunion
   * @return codeReunion
  **/
  @ApiModelProperty(value = "")


  public String getCodeReunion() {
    return codeReunion;
  }

  public void setCodeReunion(String codeReunion) {
    this.codeReunion = codeReunion;
  }

  public CourseDto codeCourse(String codeCourse) {
    this.codeCourse = codeCourse;
    return this;
  }

  /**
   * Get codeCourse
   * @return codeCourse
  **/
  @ApiModelProperty(value = "")


  public String getCodeCourse() {
    return codeCourse;
  }

  public void setCodeCourse(String codeCourse) {
    this.codeCourse = codeCourse;
  }

  public CourseDto nomHypodrome(String nomHypodrome) {
    this.nomHypodrome = nomHypodrome;
    return this;
  }

  /**
   * Get nomHypodrome
   * @return nomHypodrome
  **/
  @ApiModelProperty(value = "")


  public String getNomHypodrome() {
    return nomHypodrome;
  }

  public void setNomHypodrome(String nomHypodrome) {
    this.nomHypodrome = nomHypodrome;
  }

  public CourseDto typeCourse(String typeCourse) {
    this.typeCourse = typeCourse;
    return this;
  }

  /**
   * Get typeCourse
   * @return typeCourse
  **/
  @ApiModelProperty(value = "")


  public String getTypeCourse() {
    return typeCourse;
  }

  public void setTypeCourse(String typeCourse) {
    this.typeCourse = typeCourse;
  }

  public CourseDto nbrePartants(BigDecimal nbrePartants) {
    this.nbrePartants = nbrePartants;
    return this;
  }

  /**
   * Get nbrePartants
   * @return nbrePartants
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getNbrePartants() {
    return nbrePartants;
  }

  public void setNbrePartants(BigDecimal nbrePartants) {
    this.nbrePartants = nbrePartants;
  }

  public CourseDto listeChevaux(ChevauxDto listeChevaux) {
    this.listeChevaux = listeChevaux;
    return this;
  }

  /**
   * Get listeChevaux
   * @return listeChevaux
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ChevauxDto getListeChevaux() {
    return listeChevaux;
  }

  public void setListeChevaux(ChevauxDto listeChevaux) {
    this.listeChevaux = listeChevaux;
  }

  public CourseDto listeProduits(ProduitsDto listeProduits) {
    this.listeProduits = listeProduits;
    return this;
  }

  /**
   * Get listeProduits
   * @return listeProduits
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ProduitsDto getListeProduits() {
    return listeProduits;
  }

  public void setListeProduits(ProduitsDto listeProduits) {
    this.listeProduits = listeProduits;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CourseDto courseDto = (CourseDto) o;
    return Objects.equals(this.idReunion, courseDto.idReunion) &&
        Objects.equals(this.idCourse, courseDto.idCourse) &&
        Objects.equals(this.codeReunion, courseDto.codeReunion) &&
        Objects.equals(this.codeCourse, courseDto.codeCourse) &&
        Objects.equals(this.nomHypodrome, courseDto.nomHypodrome) &&
        Objects.equals(this.typeCourse, courseDto.typeCourse) &&
        Objects.equals(this.nbrePartants, courseDto.nbrePartants) &&
        Objects.equals(this.listeChevaux, courseDto.listeChevaux) &&
        Objects.equals(this.listeProduits, courseDto.listeProduits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idReunion, idCourse, codeReunion, codeCourse, nomHypodrome, typeCourse, nbrePartants, listeChevaux, listeProduits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CourseDto {\n");
    
    sb.append("    idReunion: ").append(toIndentedString(idReunion)).append("\n");
    sb.append("    idCourse: ").append(toIndentedString(idCourse)).append("\n");
    sb.append("    codeReunion: ").append(toIndentedString(codeReunion)).append("\n");
    sb.append("    codeCourse: ").append(toIndentedString(codeCourse)).append("\n");
    sb.append("    nomHypodrome: ").append(toIndentedString(nomHypodrome)).append("\n");
    sb.append("    typeCourse: ").append(toIndentedString(typeCourse)).append("\n");
    sb.append("    nbrePartants: ").append(toIndentedString(nbrePartants)).append("\n");
    sb.append("    listeChevaux: ").append(toIndentedString(listeChevaux)).append("\n");
    sb.append("    listeProduits: ").append(toIndentedString(listeProduits)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

