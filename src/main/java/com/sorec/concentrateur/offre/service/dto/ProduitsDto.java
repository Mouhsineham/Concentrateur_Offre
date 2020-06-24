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

import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProduitsDto
 */
@ApiModel(value = "ReferenceDataTypeDto", description = "A data transfer object to expose the reference data type entity details")
@Valid
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProduitsDto   {
  @ApiModelProperty(value = "listeProduit")
  @Valid
  private List<ProduitDto> listeProduit = null;

  public ProduitsDto listeProduit(List<ProduitDto> listeProduit) {
    this.listeProduit = listeProduit;
    return this;
  }

  public ProduitsDto addListeProduitItem(ProduitDto listeProduitItem) {
    if (this.listeProduit == null) {
      this.listeProduit = new ArrayList<ProduitDto>();
    }
    this.listeProduit.add(listeProduitItem);
    return this;
  }

  /**
   * Get listeProduit
   * @return listeProduit
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<ProduitDto> getListeProduit() {
    return listeProduit;
  }

  public void setListeProduit(List<ProduitDto> listeProduit) {
    this.listeProduit = listeProduit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProduitsDto produitsDto = (ProduitsDto) o;
    return Objects.equals(this.listeProduit, produitsDto.listeProduit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listeProduit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProduitsDto {\n");
    
    sb.append("    listeProduit: ").append(toIndentedString(listeProduit)).append("\n");
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

