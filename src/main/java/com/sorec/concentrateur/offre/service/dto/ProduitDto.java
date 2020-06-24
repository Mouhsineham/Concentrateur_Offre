package com.sorec.concentrateur.offre.service.dto;
import java.util.Objects; 
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
 
import javax.validation.Valid;
 

/**
 * ProduitDto
 */
@ApiModel(value = "ReferenceDataTypeDto", description = "A data transfer object to expose the reference data type entity details")
@Valid
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProduitDto   {
  @ApiModelProperty(value = "idProduit")
  private BigDecimal idProduit = null;

  @ApiModelProperty(value = "codeProduit")
  private String codeProduit = null;

  public ProduitDto idProduit(BigDecimal idProduit) {
    this.idProduit = idProduit;
    return this;
  }

  /**
   * Get idProduit
   * @return idProduit
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getIdProduit() {
    return idProduit;
  }

  public void setIdProduit(BigDecimal idProduit) {
    this.idProduit = idProduit;
  }

  public ProduitDto codeProduit(String codeProduit) {
    this.codeProduit = codeProduit;
    return this;
  }

  /**
   * Get codeProduit
   * @return codeProduit
  **/
  @ApiModelProperty(value = "")


  public String getCodeProduit() {
    return codeProduit;
  }

  public void setCodeProduit(String codeProduit) {
    this.codeProduit = codeProduit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProduitDto produitDto = (ProduitDto) o;
    return Objects.equals(this.idProduit, produitDto.idProduit) &&
        Objects.equals(this.codeProduit, produitDto.codeProduit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idProduit, codeProduit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProduitDto {\n");
    
    sb.append("    idProduit: ").append(toIndentedString(idProduit)).append("\n");
    sb.append("    codeProduit: ").append(toIndentedString(codeProduit)).append("\n");
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

