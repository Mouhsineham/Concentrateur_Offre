package com.sorec.concentrateur.offre.service.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sorec.concentrateur.offre.domain.Cheval;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import javax.validation.Valid;


/**
 * ChevalDto
 */
@ApiModel(value = "ReferenceDataTypeDto", description = "A data transfer object to expose the reference data type entity details")
@Valid
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChevalDto   {
	
  @ApiModelProperty(value = "idCheval")
  private Integer idCheval = null;

  @ApiModelProperty(value = "numCheval")
  private String numCheval = null;

  @ApiModelProperty(value = "codecheval")
  private String codecheval = null;

  @ApiModelProperty(value = "declarerNP")
  private Boolean declarerNP = null;

  @ApiModelProperty(value = "ecurie")
  private String ecurie = null;

  public ChevalDto idCheval(Integer idCheval) {
    this.idCheval = idCheval;
    return this;
  }

  public static ChevalDto from(Cheval model) {
	  ChevalDtoBuilder builder = ChevalDto.builder()
              .idCheval(model.getIdCheval())
              .codecheval(model.getCodeCheval())
              .declarerNP(model.getDeclarerNP())
	          .ecurie(model.getEcurie());
      return builder.build();
  }

  public static Cheval to(Cheval from) {
	  Cheval entity = new Cheval();
  	//....
      return entity;
  }

  public static void copy(ChevalDto from, Cheval to) {
      to.setIdCheval(from.getIdCheval());
      // ...
  }
 


  public ChevalDto numCheval(String numCheval) {
    this.numCheval = numCheval;
    return this;
  }

  public ChevalDto codecheval(String codecheval) {
    this.codecheval = codecheval;
    return this;
  }

  public ChevalDto declarerNP(Boolean declarerNP) {
    this.declarerNP = declarerNP;
    return this;
  }

  public Boolean isDeclarerNP() {
    return declarerNP;
  }

  public ChevalDto ecurie(String ecurie) {
    this.ecurie = ecurie;
    return this;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChevalDto chevalDto = (ChevalDto) o;
    return Objects.equals(this.idCheval, chevalDto.idCheval) &&
        Objects.equals(this.numCheval, chevalDto.numCheval) &&
        Objects.equals(this.codecheval, chevalDto.codecheval) &&
        Objects.equals(this.declarerNP, chevalDto.declarerNP) &&
        Objects.equals(this.ecurie, chevalDto.ecurie);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idCheval, numCheval, codecheval, declarerNP, ecurie);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChevalDto {\n");
    
    sb.append("    idCheval: ").append(toIndentedString(idCheval)).append("\n");
    sb.append("    numCheval: ").append(toIndentedString(numCheval)).append("\n");
    sb.append("    codecheval: ").append(toIndentedString(codecheval)).append("\n");
    sb.append("    declarerNP: ").append(toIndentedString(declarerNP)).append("\n");
    sb.append("    ecurie: ").append(toIndentedString(ecurie)).append("\n");
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

