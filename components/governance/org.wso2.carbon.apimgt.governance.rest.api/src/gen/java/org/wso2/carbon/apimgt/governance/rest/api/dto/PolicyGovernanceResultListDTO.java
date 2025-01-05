package org.wso2.carbon.apimgt.governance.rest.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.wso2.carbon.apimgt.governance.rest.api.dto.PaginationDTO;
import org.wso2.carbon.apimgt.governance.rest.api.dto.PolicyGovernanceResultInfoDTO;
import javax.validation.constraints.*;

/**
 * A list of policy governance results.
 **/

import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;
import org.wso2.carbon.apimgt.rest.api.common.annotations.Scope;
import com.fasterxml.jackson.annotation.JsonCreator;

import javax.validation.Valid;

@ApiModel(description = "A list of policy governance results.")

public class PolicyGovernanceResultListDTO   {
  
    private Integer count = null;
    private List<PolicyGovernanceResultInfoDTO> list = new ArrayList<PolicyGovernanceResultInfoDTO>();
    private PaginationDTO pagination = null;

  /**
   * Number of policy governance results returned.
   **/
  public PolicyGovernanceResultListDTO count(Integer count) {
    this.count = count;
    return this;
  }

  
  @ApiModelProperty(example = "10", value = "Number of policy governance results returned.")
  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }
  public void setCount(Integer count) {
    this.count = count;
  }

  /**
   * List of policy governance results.
   **/
  public PolicyGovernanceResultListDTO list(List<PolicyGovernanceResultInfoDTO> list) {
    this.list = list;
    return this;
  }

  
  @ApiModelProperty(value = "List of policy governance results.")
      @Valid
  @JsonProperty("list")
  public List<PolicyGovernanceResultInfoDTO> getList() {
    return list;
  }
  public void setList(List<PolicyGovernanceResultInfoDTO> list) {
    this.list = list;
  }

  /**
   **/
  public PolicyGovernanceResultListDTO pagination(PaginationDTO pagination) {
    this.pagination = pagination;
    return this;
  }

  
  @ApiModelProperty(value = "")
      @Valid
  @JsonProperty("pagination")
  public PaginationDTO getPagination() {
    return pagination;
  }
  public void setPagination(PaginationDTO pagination) {
    this.pagination = pagination;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PolicyGovernanceResultListDTO policyGovernanceResultList = (PolicyGovernanceResultListDTO) o;
    return Objects.equals(count, policyGovernanceResultList.count) &&
        Objects.equals(list, policyGovernanceResultList.list) &&
        Objects.equals(pagination, policyGovernanceResultList.pagination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, list, pagination);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PolicyGovernanceResultListDTO {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    list: ").append(toIndentedString(list)).append("\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
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

