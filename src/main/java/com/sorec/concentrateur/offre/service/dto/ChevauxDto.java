package com.sorec.concentrateur.offre.service.dto;
import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;


/**
 * ChevauxDto
 */
@ApiModel(value = "ReferenceDataTypeDto", description = "A data transfer object to expose the reference data type entity details")
@Valid
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChevauxDto   {
	
  @ApiModelProperty(value = "listeCheveaux")
  @Valid
  private List<ChevalDto> listeCheveaux = null;

  public ChevauxDto listeCheveaux(List<ChevalDto> listeCheveaux) {
    this.listeCheveaux = listeCheveaux;
    return this;
  }

  public ChevauxDto addListeCheveauxItem(ChevalDto listeCheveauxItem) {
    if (this.listeCheveaux == null) {
      this.listeCheveaux = new ArrayList<ChevalDto>();
    }
    this.listeCheveaux.add(listeCheveauxItem);
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
    ChevauxDto chevauxDto = (ChevauxDto) o;
    return Objects.equals(this.listeCheveaux, chevauxDto.listeCheveaux);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listeCheveaux);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChevauxDto {\n");
    
    sb.append("    listeCheveaux: ").append(toIndentedString(listeCheveaux)).append("\n");
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

